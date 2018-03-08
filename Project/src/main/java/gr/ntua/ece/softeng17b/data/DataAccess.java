package gr.ntua.ece.softeng17b.data;

import javax.sql.DataSource;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import gr.ntua.ece.softeng17b.conf.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class DataAccess {

    private static final int MAX_TOTAL_CONNECTIONS = 16;
    private static final int MAX_IDLE_CONNECTIONS = 8;

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private Elastic elastic;
    RandomString generator = new RandomString(8);

    public void setup(String driverClass, String url, String user, String pass, Elastic elastic) throws SQLException {

        //initialize the data source
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName(driverClass);
        bds.setUrl(url);
        bds.setMaxTotal(MAX_TOTAL_CONNECTIONS);
        bds.setMaxIdle(MAX_IDLE_CONNECTIONS);
        bds.setUsername(user);
        bds.setPassword(pass);
        bds.setValidationQuery("SELECT 1");
        bds.setTestOnBorrow(true);
        bds.setDefaultAutoCommit(true);

        //check that everything works OK
        bds.getConnection().close();

        //initialize the jdbc template utilitiy
        jdbcTemplate = new JdbcTemplate(bds);

        //keep the dataSource for the low-level manual example to function (not actually required)
        dataSource = bds;

        this.elastic = elastic;
    }

    public void shutdown() {
        elastic.shutdown();
    }


    public List<Client> getAllClients() {
        return jdbcTemplate.query("select * from clients,wallet where clients.user_id = wallet.user_id", new ClientRowMapper());
    }

    public List<Provider> getAllProviders() {
        return jdbcTemplate.query("select * from providers", new ProviderRowMapper());
    }

    public List<Event> getAllEvents() {
        return jdbcTemplate.query("select * from events limit 9 offset 9", new EventRowMapper());
    }


    public Optional<Client> getClient(Long id) {
        Long[] params = new Long[]{id};
        List<Client> places = jdbcTemplate.query("select * from clients,wallet where clients.user_id = ? and clients.user_id = wallet.user_id", params, new ClientRowMapper());
        if (places.size() == 1) {
            return Optional.of(places.get(0));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Client> getClientByUsername(String username) {
        String[] params = new String[]{username};
        List<Client> places = jdbcTemplate.query("select * from clients,wallet where username = ? and clients.user_id = wallet.user_id", params, new ClientRowMapper());
        if (places.size() == 1) {
            return Optional.of(places.get(0));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Admin> getAdminByUsername(String username) {
        String[] params = new String[]{username};
        List<Admin> admins = jdbcTemplate.query("select * from admins where username = ?", params, new AdminRowMapper());
        if (admins.size() == 1) {
            return Optional.of(admins.get(0));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Provider> getProvider(Long id) {
        Long[] params = new Long[]{id};
        List<Provider> providers = jdbcTemplate.query("select * from providers where prov_id = ?", params, new ProviderRowMapper());
        if (providers.size() == 1) {
            return Optional.of(providers.get(0));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Provider> getProviderByUsername(String username) {
        String[] params = new String[]{username};
        List<Provider> providers = jdbcTemplate.query("select * from providers where username = ?", params, new ProviderRowMapper());
        if (providers.size() == 1) {
            return Optional.of(providers.get(0));
        } else {
            return Optional.empty();
        }
    }

    //new addition 5-3
    public List<Event> getAllEventsByProvider(long id){
        return jdbcTemplate.query("select * from events where prov_id=?", new Object[]{id},new EventRowMapper());
    }

    public Optional<Event> getEventById(long id){
        Long[] params = new Long[]{id};
        List<Event> events = jdbcTemplate.query("select * from events where event_id = ?", params, new EventRowMapper());
        if (events.size() == 1) {
            return Optional.of(events.get(0));
        } else {
            return Optional.empty();
        }
    }

    public void setImages(Event ne){
        try {
            Optional<Event> optional = getEventById(ne.getEvent_id());
            Event ue = optional.orElseThrow(() -> new Exception("Client Not Found"));
            String query = "update events set images=? where event_id=?";
            jdbcTemplate.update(query, new Object[]{ne.getImages(), ne.getEvent_id()});
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    //allages
    public void createProvider(Provider p) {

        Object[] params = {p.getUsername(),p.getPassword(),p.getCompany_name(),p.getAfm(),p.getIban(),p.getFirst_name(),p.getLast_name(),p.getM_phone(),p.getPostal_code(),
                            p.getPhone(),p.getCity(),p.getAddress(),p.getAddress_num(),p.getEmail(),new Timestamp(Calendar.getInstance().getTime().getTime()), p.getLongtitude(),p.getLatitude(),false,false,0};

        String SQL = "insert into " +
                "providers (username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, postal_code, phone, city, address, address_num, email,subscription, long, lat, disabled, blocked,dept)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);
    }

    //αλλαγες
    public long createClient(Client c) {

        //Client new_c = new Client();
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into " +
                "clients (username, password, first_name, last_name, postal_code, phone, city, address, address_num, email, long, lat, disabled, blocked)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, false, false)";

        Connection con = null;
        ResultSet rs = null;

        jdbcTemplate.update(con1 -> {

            PreparedStatement stmt = con1.prepareStatement(query, new String[]{"user_id"});
            stmt.setString(1,c.getUsername());
            stmt.setString(2,c.getPassword());
            stmt.setString(3,c.getFirst_name());
            stmt.setString(4,c.getLast_name());
            stmt.setString(5,c.getPostal_code());
            stmt.setString(6,c.getM_phone());
            stmt.setString(7,c.getCity());
            stmt.setString(8,c.getAddress());
            stmt.setString(9,c.getAddress_num());
            stmt.setString(10,c.getEmail());
            stmt.setDouble(11,c.getLongtitude());
            stmt.setDouble(12,c.getLatitude());

            return stmt;
        },keyHolder);
        long new_id = keyHolder.getKey().longValue();

        jdbcTemplate.update("insert into wallet(user_id,balance,bonus) values(?, ?, ?) ", new Object[]{new_id,0,0});

        return new_id;
    }

    /*public void createEvent(Event e){
        String tags = String.join(",",e.getTags());
        String images = String.join(",", e.getImages());
        Object[] params = new Object[]{e.getProv_id(),e.getTitle(),e.getDate(),e.getTickets(),e.getPrice(),e.getDescription(),tags,images};

        String SQL = "insert into " +
                "events (prov_id, event_id, name, date, tickets, price, description, tags, images)" +
                " values (?, DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);

    }*/

    public long createEvent(Event ne) {

        //Create the new event record using a prepared statement
        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(
                        "insert into events(prov_id, event_id, name, date, tickets, price, description, tags, images, long, lat, duration)" +
                                " values(?, default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                        new String[]{"event_id"}
                );
                ps.setLong(1, ne.getProv_id());
                ps.setString(2, ne.getTitle());
                ps.setTimestamp(3, new Timestamp(ne.getDate().getTime()));
                ps.setInt(4, ne.getTickets());
                ps.setDouble(5,ne.getPrice());
                ps.setString(6, ne.getDescription());
                if (ne.getTags() == null) {
                    ps.setNull(7, Types.INTEGER);
                }
                else {
                    ps.setString(7, ne.getTags());
                }
                ps.setString(8, ne.getImages());
                ps.setDouble(9,ne.getPlace().getLongitude());
                ps.setDouble(10,ne.getPlace().getLatitude());
                ps.setInt(11, ne.getDuration());
                return ps;
            }
        };
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        int cnt = jdbcTemplate.update(psc, keyHolder);

        if (cnt == 1) {
            //New row has been added
            /*Event event = new Event(
                    keyHolder.getKey().longValue(), //the newly created event id
                    title,
                    description,
                    subject,
                    tickets,
                    place
            );*/
            //System.out.println(keyHolder.getKeys());
            ne.setEvent_id(keyHolder.getKey().longValue());
            //add it to elastic
            elastic.add(ne);

            return ne.getEvent_id();

        }
        else {
            throw new RuntimeException("Creation of event failed");
        }
    }

    public double addWallet(long id, double coins) throws Exception{

        Optional<Client> optional = getClient(id);
        Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
        double new_balance = c.getWallet() + coins;
        double new_bonus = c.getBonus() + coins;
        if(new_bonus >= 200){
            new_bonus = new_bonus - 200.;
            new_balance = new_balance + 20;
        }
        String query = "update wallet set balance=?,bonus=? where user_id=?";
        jdbcTemplate.update(query, new Object[]{new_balance,new_bonus,id});
        c.setWallet(new_balance);

        return c.getWallet();
    }

    public double subWallet(long id, double coins) throws Exception{

        Optional<Client> optional = getClient(id);
        Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
        double new_balance = c.getWallet() - coins;
        if(new_balance<0){
            throw new Exception("Not enough points");
        }
        else {
            String query = "update wallet set balance=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{new_balance, id});
            c.setWallet(new_balance);

            return c.getWallet();
        }
    }

    public SearchResults searchEvents(String text, Long subject, Long distanceInKm, Location fromLoc, int from, int count) {
        return elastic.search(text, subject, true, distanceInKm, fromLoc, from, count);
    }

    public Timestamp renewSub(int months,long id)throws Exception{
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Optional<Provider> optional = getProvider(id);
        Provider pr = optional.orElseThrow(() -> new Exception("Provider Not Found"));
        Timestamp exists = pr.getSubscription();
        Calendar cal = Calendar.getInstance();
        if(cal.getTime().getTime() < exists.getTime()){
            cal.setTimeInMillis(exists.getTime());
        }
        cal.add(Calendar.MONTH, months);
        Date now = cal.getTime();
        Timestamp toBase = new Timestamp(now.getTime());
        String query = "update providers set subscription=? where prov_id=?";
        jdbcTemplate.update(query, new Object[]{toBase, id});

        //System.out.println(dateFormat.format(cal));
        return toBase;
    }

    public List<Event> freeTextSearch(String searchtext){
        SearchResults res = searchEvents(searchtext,null,null,null,0,9);
        Long[] ids= new Long[(int)res.count];
        for(int i = 0 ; i<res.ids.size(); i++){
            ids[i] = Long.parseLong(res.ids.get(i));
        }
        if (ids.length != 0) {
            String query = "select * from events where event_id in(?)";
            List<Event> events = jdbcTemplate.query(query, ids, new EventRowMapper());
            return events;
        }
        else return null;
    }

    //---------------------allageeees-------------------------------//

    public Client blockClient(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            c.setBlocked(true);
            String query = "update clients set blocked=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{c.isBlocked(), id});
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Provider blockProvider(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Provider Not Found"));
            p.setBlocked(true);
            String query = "update providers set blocked=? where prov_id=?";
            jdbcTemplate.update(query, new Object[]{p.isBlocked(), id});
            return p;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Provider unblockProvider(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Provider Not Found"));
            p.setBlocked(false);
            String query = "update providers set blocked=? where prov_id=?";
            jdbcTemplate.update(query, new Object[]{p.isBlocked(), id});
            return p;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Client unblockClient(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            c.setBlocked(false);
            String query = "update clients set blocked=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{c.isBlocked(), id});
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Client disableClient(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            c.setDisabled(true);
            String query = "update clients set blocked=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{c.isDisabled(), id});
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Provider disableProvider(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Provider Not Found"));
            p.setDisabled(true);
            String query = "update providers set blocked=? where prov_id=?";
            jdbcTemplate.update(query, new Object[]{p.isDisabled(), id});
            return p;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Provider undisableProvider(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Provider Not Found"));
            p.setDisabled(false);
            String query = "update providers set blocked=? where prov_id=?";
            jdbcTemplate.update(query, new Object[]{p.isDisabled(), id});
            return p;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Client undisableClient(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            c.setDisabled(false);
            String query = "update clients set blocked=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{c.isDisabled(), id});
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleteClient(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            String query = "delete from clients where user_id=?";
            jdbcTemplate.update(query, new Object[]{id});
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteProvider(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Provider Not Found"));
            String query = "delete from providers where prov_id=?";
            jdbcTemplate.update(query, new Object[]{id});
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public String resetClientPassword(long id){
        try {
            Optional<Client> optional = getClient(id);
            Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
            String new_pass = generator.nextString();
            EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();
            c.setPassword(encrypter.encryptPass(new_pass));
            String query = "update clients set password=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{c.getPassword(),id});
            return new_pass;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public String resetProviderPassword(long id){
        try {
            Optional<Provider> optional = getProvider(id);
            Provider p = optional.orElseThrow(() -> new Exception("Client Not Found"));
            String new_pass = generator.nextString();
            EncryptionUtils encrypter = Configuration.getInstance().getEncrypter();
            p.setPassword(encrypter.encryptPass(new_pass));
            String query = "update clients set password=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{p.getPassword(),id});
            return new_pass;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean buyTicket(int number,long user_id, long event_id){
        Connection con = null;
        PreparedStatement getWallet = null;
        PreparedStatement subWallet = null;
        PreparedStatement getTickets = null;
        PreparedStatement subTickets = null;
        PreparedStatement getDept = null;
        PreparedStatement updDept = null;
        ResultSet rsW = null;
        ResultSet rsT = null;
        ResultSet rsP = null;

        String getWalletString = "select * from wallet " +
                "where user_id = ? " +
                "for update";

        String subWalletString = "update wallet set balance=? where user_id=?";

        String getTicketsString = "select * from events " +
                "where event_id = ? " +
                "for update";

        String subTicketsString = "update events set tickets=? where event_id=?";

        String getDeptString = "select * from providers " +
                "where prov_id = ? " +
                "for update";

        String updDeptString = "update providers set dept=? where prov_id=?";

        try {
            con = dataSource.getConnection();
            con.setAutoCommit(false);
            getWallet = con.prepareStatement(getWalletString);
            subWallet = con.prepareStatement(subWalletString);
            getTickets = con.prepareStatement(getTicketsString);
            subTickets = con.prepareStatement(subTicketsString);
            getDept = con.prepareStatement(getDeptString);
            updDept = con. prepareStatement(updDeptString);

            getWallet.setLong(1,user_id);
            rsW = getWallet.executeQuery();
            double money = rsW.getDouble("balance");

            getTickets.setLong(1, event_id);
            rsT = getTickets.executeQuery();
            double price = rsT.getDouble("price");
            int tickets = rsT.getInt("tickets");

            if(money >= (number*price)){
                if (tickets - number >= 0){
                    double new_money = money - (number*price);
                    int new_tickets = tickets - number;

                    subWallet.setDouble(1, new_money);
                    subWallet.setLong(2, user_id);
                    subWallet.executeUpdate();

                    subTickets.setInt(1, new_tickets);
                    subTickets.setLong(2, event_id);
                    subTickets.executeUpdate();

                    getDept.setLong(1,rsT.getLong("prov_id"));
                    rsP = getDept.executeQuery();
                    double dept = rsP.getDouble("dept");
                    dept = dept + (number*price);

                    updDept.setDouble(1,dept);
                    updDept.setLong(2, rsT.getLong("prov_id"));
                    rsP = getDept.executeQuery();

                    con.commit();

                }
                else throw new Exception("Not enough tickets");
            }
            else throw new Exception("Not enough points");

        }
        catch (Exception e){
            e.printStackTrace();
            if (con != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    con.rollback();
                } catch(SQLException except) {
                    except.printStackTrace();
                }
            }
        }
        finally {
            try {
                if (getWallet != null) {
                    getWallet.close();
                }
                if (subWallet != null) {
                    subWallet.close();
                }
                if (getTickets != null) {
                    getTickets.close();
                }
                if (subTickets != null) {
                    subTickets.close();
                }
                if (getDept != null) {
                    getDept.close();
                }
                if (updDept != null) {
                    updDept.close();
                }
                con.setAutoCommit(true);
            }
            catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;

    }

   /* public double subTicket(long id, double coins) throws Exception{

        Optional<Client> optional = getClient(id);
        Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
        double new_balance = c.getWallet() + coins;

        String query = "update wallet set balance=? where user_id=?";
        jdbcTemplate.update(query, new Object[]{new_balance,id});
        c.setWallet(new_balance);

        return c.getWallet();
    }*/
}


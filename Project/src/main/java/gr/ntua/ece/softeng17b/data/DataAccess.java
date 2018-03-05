package gr.ntua.ece.softeng17b.data;

import javax.sql.DataSource;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DataAccess {

    private static final int MAX_TOTAL_CONNECTIONS = 16;
    private static final int MAX_IDLE_CONNECTIONS = 8;

    private DataSource basicDataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Elastic elastic;

    @Autowired
    public DataAccess(BasicDataSource basicDataSource){
        this.basicDataSource = basicDataSource;
    }


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

    }


    public List<Client> getAllClients() {
        return jdbcTemplate.query("select * from clients", new ClientRowMapper());
    }

    public List<Provider> getAllProviders() {
        return jdbcTemplate.query("select * from providers", new ProviderRowMapper());
    }

    public Optional<Client> getClient(Long id) {
        Long[] params = new Long[]{id};
        List<Client> places = jdbcTemplate.query("select * from clients where clients.user_id = ?", params, new ClientRowMapper());
        if (places.size() == 1) {
            return Optional.of(places.get(0));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Client> getClientByUsername(String username) {
        String[] params = new String[]{username};
        List<Client> places = jdbcTemplate.query("select * from clients where username = ?", params, new ClientRowMapper());
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

    public void createProvider(Provider p) {

        Object[] params = {p.getUsername(),p.getPassword(),p.getCompany_name(),p.getAfm(),p.getIban(),p.getFirst_name(),p.getLast_name(),p.getM_phone(),p.getPostal_code(),
                            p.getPhone(),p.getCity(),p.getAddress(),p.getAddress_num(),p.getEmail(),new Timestamp(Calendar.getInstance().getTime().getTime()),p.getLongtitude(),p.getLatitude()};

        String SQL = "insert into " +
                "providers (username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, postal_code, phone, city, address, address_num, email,subscription, long, lat)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);
        /*try {
            jdbcTemplate.getDataSource().getConnection().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
    }

    public int createClient(Client c) {

        //Client new_c = new Client();
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into " +
                "clients (username, password, first_name, last_name, postal_code, phone, city, address, address_num, email, long, lat, balance)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)";

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
        int new_id = keyHolder.getKey().intValue();
        /*try {
            jdbcTemplate.getDataSource().getConnection().commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
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

    public Event createEvent(Event ne) {

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
                ps.setTimestamp(3, ne.getDate());
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

            return ne;

        }
        else {
            throw new RuntimeException("Creation of event failed");
        }
    }

    public double addWallet(long id, double coins) throws Exception{

        Optional<Client> optional = getClient(id);
        Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
        double new_balance = c.getWallet() + coins;

        String query = "update clients set balance=? where user_id=?";
        jdbcTemplate.update(query, new Object[]{new_balance,id});
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
            String query = "update clients set balance=? where user_id=?";
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


    public void shutdown() {
        elastic.shutdown();
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


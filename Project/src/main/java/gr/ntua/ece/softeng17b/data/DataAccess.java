package gr.ntua.ece.softeng17b.data;

import javax.sql.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class DataAccess {

    private static final int MAX_TOTAL_CONNECTIONS = 16;
    private static final int MAX_IDLE_CONNECTIONS = 8;

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private Elastic elastic;


    public void setup(String driverClass, String url, String user, String pass) throws SQLException {

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


    public List<Client> getAllClients() {
        return jdbcTemplate.query("select * from clients,wallet where clients.user_id = wallet.user_id", new ClientRowMapper());
    }

    public List<Provider> getAllProviders() {
        return jdbcTemplate.query("select * from providers", new ProviderRowMapper());
    }

    public Optional<Client> getClient(Long id) {
        Long[] params = new Long[]{id};
        List<Client> places = jdbcTemplate.query("select * from clients,wallet where user_id = ? and clients.user_id = wallet.user_id", params, new ClientRowMapper());
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
        List<Provider> providers = jdbcTemplate.query("select * from providers where user_id = ?", params, new ProviderRowMapper());
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
                            p.getPhone(),p.getCity(),p.getAddress(),p.getAddress_num(),p.getEmail()};

        String SQL = "insert into " +
                "providers (username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, postal_code, phone, city, address, address_num, email)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);
    }

    public int createClient(Client c) {

        //Client new_c = new Client();
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into " +
                "clients (username, password, first_name, last_name, postal_code, phone, city, address, address_num, email)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
            return stmt;
        },keyHolder);
        int new_id = keyHolder.getKey().intValue();

        jdbcTemplate.update("insert into wallet(user_id,balance) values(?, ?) ", new Object[]{new_id,0});

        return new_id;
    }

    public void createEvent(Event e){
        String tags = String.join(",",e.getTags());
        String images = String.join(",", e.getImages());
        Object[] params = new Object[]{e.getProv_id(),e.getTitle(),e.getDate(),e.getTickets(),e.getPrice(),e.getDescription(),tags,images};

        String SQL = "insert into " +
                "events (prov_id, event_id, name, date, tickets, price, description, tags, images)" +
                " values (?, DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);

    }

    public double addWallet(long id, double coins) throws Exception{

        Optional<Client> optional = getClient(id);
        Client c = optional.orElseThrow(() -> new Exception("Client Not Found"));
        double new_balance = c.getWallet() + coins;

        String query = "update wallet set balance=? where user_id=?";
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
            String query = "update wallet set balance=? where user_id=?";
            jdbcTemplate.update(query, new Object[]{new_balance, id});
            c.setWallet(new_balance);

            return c.getWallet();
        }
    }

    public SearchResults searchEvents(String text, Long subject, Long distanceInKm, Location fromLoc, int from, int count) {
        return elastic.search(text, subject, true, distanceInKm, fromLoc, from, count);
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


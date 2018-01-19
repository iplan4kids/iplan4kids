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
    }


    public List<Client> getAllClients() {
        return jdbcTemplate.query("select * from clients", new ClientRowMapper());
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

    public void createProvider(Object[] params) {
        String SQL = "insert into " +
                "providers (username, password, full_name, afm, iban, m_first_name, m_last_name, m_phone, postal_code, phone, city, address, address_num, email)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update( SQL, params);
    }

    public void createClient(String[] params) {

        Client new_c = new Client();
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into " +
                "clients (username, password, first_name, last_name, postal_code, phone, city, address, address_num, email)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection con = null;
        ResultSet rs = null;

        jdbcTemplate.update(con1 -> {

            PreparedStatement stmt = con1.prepareStatement(query, new String[]{"ID"});
            stmt.setString(1,params[0]);
            stmt.setString(2,params[1]);
            stmt.setString(3,params[2]);
            stmt.setString(4,params[3]);
            stmt.setString(5,params[4]);
            stmt.setString(6,params[5]);
            stmt.setString(7,params[6]);
            stmt.setString(8,params[7]);
            stmt.setString(9,params[8]);
            stmt.setString(10,params[9]);
            return stmt;
        },keyHolder);
        int new_id = keyHolder.getKey().intValue();

        jdbcTemplate.update("insert into wallet(user_id,balance) values(?, ?) ", new Object[]{new_id,0});
    }


}


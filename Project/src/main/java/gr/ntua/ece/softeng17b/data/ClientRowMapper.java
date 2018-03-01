package gr.ntua.ece.softeng17b.data;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.*;

public class ClientRowMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        Client cl = new Client();
        cl.setId(rs.getInt("user_id"));
        cl.setUsername(rs.getString("username"));
        cl.setPassword(rs.getString("password"));
        cl.setFirst_name(rs.getString("first_name"));
        cl.setLast_name(rs.getString("last_name"));
        cl.setPostal_code(rs.getString("postal_code"));
        cl.setM_phone(rs.getString("phone"));
        cl.setCity(rs.getString("city"));
        cl.setAddress(rs.getString("address"));
        cl.setAddress_num(rs.getString("address_num"));
        cl.setEmail(rs.getString("email"));
        cl.setWallet(rs.getDouble("balance"));
        cl.setLongtitude(rs.getDouble("long"));
        cl.setLatitude(rs.getDouble("lat"));

        return cl;
    }

}

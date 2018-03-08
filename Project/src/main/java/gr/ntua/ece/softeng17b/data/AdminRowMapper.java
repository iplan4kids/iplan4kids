package gr.ntua.ece.softeng17b.data;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.*;

public class AdminRowMapper implements RowMapper<Admin> {
    @Override
    public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
        Admin ad = new Admin();
        ad.setId(rs.getLong("admin_id"));
        ad.setUsername(rs.getString("username"));
        ad.setPassword(rs.getString("password"));
        ad.setFirst_name(rs.getString("first_name"));
        ad.setLast_name(rs.getString("last_name"));
        ad.setM_phone(rs.getString("phone"));
        ad.setEmail(rs.getString("email"));

        return ad;
    }

}

package gr.ntua.ece.softeng17b.data;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class ProviderRowMapper implements RowMapper<Provider> {
    @Override
    public Provider mapRow(ResultSet rs, int rowNum) throws SQLException {
        Provider pr = new Provider();
        pr.setId(rs.getInt("prov_id"));
        pr.setUsername(rs.getString("username"));
        pr.setPassword(rs.getString("password"));
        pr.setCompany_name(rs.getString("full_name"));
        pr.setAfm(rs.getString("afm"));
        pr.setIban(rs.getString("iban"));
        pr.setFirst_name(rs.getString("m_first_name"));
        pr.setLast_name(rs.getString("m_last_name"));
        pr.setM_phone(rs.getString("m_phone"));
        pr.setPostal_code(rs.getString("postal_code"));
        pr.setPhone(rs.getString("phone"));
        pr.setCity(rs.getString("city"));
        pr.setAddress(rs.getString("address"));
        pr.setAddress_num(rs.getString("address_num"));
        pr.setEmail(rs.getString("email"));
        pr.setSubscription(rs.getTimestamp("subscription"));


        return pr;
    }
}

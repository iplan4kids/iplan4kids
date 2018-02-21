package gr.ntua.ece.softeng17b.data;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.*;

public class EventRowMapper implements RowMapper<Event> {
    @Override
    public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
        Event ev = new Event();
        ev.setProv_id(rs.getInt("prov_id"));
        ev.setEvent_id(rs.getInt("event_id"));
        ev.setTitle(rs.getString("name"));
        ev.setDate(rs.getTimestamp("date"));
        ev.setTickets(rs.getInt("tickets"));
        ev.setPrice(rs.getDouble("price"));
        ev.setDescription(rs.getString("Description"));
        ev.setTags(rs.getString("tags"));
        ev.setImages(rs.getString("images"));

        return ev;
    }

}

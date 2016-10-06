/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Mo
 */
public class SeatbooktmpRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Seatbooktmp data = new Seatbooktmp();
        data.setNoka(resultSet.getString("NOKA"));
        data.setScheduleid(resultSet.getString("C_SCHEDULE_ID"));
        data.setTripid(resultSet.getString("C_TRIP_ID"));
        data.setTripdate(LocalDate.parse(resultSet.getString("TRIPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setStamformdetid(resultSet.getString("C_STAMFORMDET_ID"));
        data.setWagondetid(resultSet.getString("C_WAGONDET_ID"));
        data.setLegval(resultSet.getString("LEGVAL"));
        data.setWgdrow(resultSet.getInt("SEATROW"));
        data.setWgdcol(resultSet.getString("SEATCOL"));
        data.setSfdcode(resultSet.getString("STAMFORMDET_CODE"));
        data.setSfdorder(resultSet.getInt("C_STAMFORMDET_ORDER"));
        data.setDomain(resultSet.getString("C_SCHEDULE_DOMAIN"));
        data.setId(resultSet.getString("C_SEATBOOKTMP_ID"));
        data.setExpdate(LocalDate.parse(resultSet.getString("EXPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        return data;
    }
}

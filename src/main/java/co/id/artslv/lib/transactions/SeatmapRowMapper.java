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
public class SeatmapRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Seatmap data = new Seatmap();
        data.setNoka(resultSet.getString("NOKA"));
        data.setScheduleid(resultSet.getString("C_SCHEDULE_ID"));
        data.setTripid(resultSet.getString("C_TRIP_ID"));
        data.setTrainrelation(resultSet.getString("TRAINRELATION"));
        data.setTripdate(LocalDate.parse(resultSet.getString("TRIPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setStasiunidorg(resultSet.getString("C_STASIUN_IDORG"));
        data.setStasiuniddest(resultSet.getString("C_STASIUN_IDDEST"));
        data.setSubclass(resultSet.getString("SUBCLASS"));
        data.setSubclasscode(resultSet.getString("SUBCLASSCODE"));
        data.setStamformdetid(resultSet.getString("C_STAMFORMDET_ID"));
        data.setWagonid(resultSet.getString("C_WAGON_ID"));
        data.setWagondetid(resultSet.getString("C_WAGONDET_ID"));
        data.setStatus(resultSet.getInt("SEATBOOKSTATUS"));
        data.setStamformcode(resultSet.getString("STAMFORMDET_CODE"));
        data.setSeatcol(resultSet.getString("SEATCOL"));
        data.setSeatrow(resultSet.getString("SEATROW"));
        return data;
    }
}

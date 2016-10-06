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
public class AvailabilityRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Availability data = new Availability();
        data.setNoka(resultSet.getString("NOKA"));
        data.setScheduleid(resultSet.getString("C_SCHEDULE_ID"));
        data.setTripid(resultSet.getString("C_TRIP_ID"));
        data.setTrainname(resultSet.getString("TRAINNAME"));
        data.setTripdate(LocalDate.parse(resultSet.getString("TRIPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setStasiunidorg(resultSet.getString("STASIUNIDORG"));
        data.setStasiunorg(resultSet.getString("STASIUNORG"));
        data.setDeparturedate(LocalDate.parse(resultSet.getString("DEPARTUREDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setDeparturetime(resultSet.getString("DEPARTURETIME"));
        data.setStasiuniddest(resultSet.getString("STASIUNIDDEST"));
        data.setStasiundest(resultSet.getString("STASIUNDEST"));
        data.setArrivaldate(LocalDate.parse(resultSet.getString("ARRIVALDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setArrivaltime(resultSet.getString("ARRIVALTIME"));
        data.setTransit(resultSet.getInt("TRANSIT"));
        data.setSubclassid(resultSet.getString("C_SUBCLASS_ID"));
        data.setSubclass(resultSet.getString("SUBCLASS"));
        data.setAvail(resultSet.getString("AVAIL"));
        data.setLegval(resultSet.getString("LEGVAL"));
        data.setWagonclassid(resultSet.getString("C_WAGONCLASS_ID"));
        data.setWagonclass(resultSet.getString("WAGONCLASS"));
        data.setFareadult(resultSet.getLong("FAREADULT"));
        data.setFareinfant(resultSet.getLong("FAREINFANT"));
        data.setRateidadult(resultSet.getString("RATEIDADULT"));
        data.setRateidinfant(resultSet.getString("RATEIDINFANT"));
        return data;
    }
}

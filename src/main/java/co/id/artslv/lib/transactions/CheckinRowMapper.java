package co.id.artslv.lib.transactions;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Irpan Budiana on 6/23/16.
 */
public class CheckinRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Checkin data = new Checkin();

        data.setTransactionid(resultSet.getString("C_TRANSACTION_ID"));
        data.setTransactiondetid(resultSet.getString("C_TRANSACTIONDET_ID"));
        data.setTripid(resultSet.getString("C_TRIP_ID"));
        data.setDepartdate(LocalDate.parse(resultSet.getString("DEPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setBookcode(resultSet.getString("C_TRANSACTION_BOOKCODE"));
        data.setNumcode(resultSet.getString("C_TRANSACTION_PAYCODE"));
        data.setPsgname(resultSet.getString("C_TRANSACTIONDET_PSGNAME"));
        data.setTitlecode(resultSet.getString("C_TITLE_CODE"));
        data.setNoka(resultSet.getString("C_SCHEDULE_NOKA"));
        data.setTrainname(resultSet.getString("C_TRAIN_NAME"));
        data.setWagonname(resultSet.getString("C_WAGON_NAME"));
        data.setSeatrow(resultSet.getInt("C_WAGONDET_ROW"));
        data.setSeatcol(resultSet.getString("C_WAGONDET_COL"));
        data.setSeatcol(resultSet.getString("C_WAGONDET_COL"));
        data.setCheckinnum(resultSet.getString("C_TRANSACTIONDET_CHECKINNUM"));
        data.setTransdetstatus(resultSet.getString("C_TRANSACTIONDET_STATUS"));
        data.setPassengerid(resultSet.getString("C_TRANSACTIONDET_PSGID"));
        data.setPassengertype(resultSet.getString("C_TRANSACTIONDET_PSGTYPE"));
        data.setStaorgname(resultSet.getString("STA_ORGNAME"));
        data.setStadestname(resultSet.getString("STA_DESTNAME"));
        data.setDepartdatetimeorg(resultSet.getString("DEPARTDATETIMEORG"));
        data.setArrivedatetimedest(resultSet.getString("ARRIVEDATETIMEDEST"));
        data.setReductionid(resultSet.getString("C_REDUCTION_ID"));
        data.setReductionname(resultSet.getString("C_REDUCTION_NAME"));
        data.setStamformdetid(resultSet.getString("C_STAMFORMDET_ID"));
        data.setStamformdetorder(resultSet.getString("C_STAMFORMDET_ORDER"));

        return data;
    }
}
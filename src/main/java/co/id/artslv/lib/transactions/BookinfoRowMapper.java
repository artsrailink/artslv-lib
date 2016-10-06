/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Mo
 */
public class BookinfoRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Bookinfo data = new Bookinfo();
        data.setArv_date(LocalDate.parse(resultSet.getString("ARVDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setArv_time(resultSet.getString("ARVTIME"));
        data.setBook_balance(resultSet.getLong("BOOKBALANCE"));
        data.setBook_code(resultSet.getString("BOOKCODE"));
        data.setCaller(resultSet.getString("CALLER"));
        data.setDep_date(LocalDate.parse(resultSet.getString("DEPDATE"), DateTimeFormatter.ISO_LOCAL_DATE));
        data.setDep_time(resultSet.getString("DEPTIME"));
        data.setDes(resultSet.getString("STCODEDEST"));
        data.setDesname(resultSet.getString("STNAMEDEST"));
        data.setDiscount(resultSet.getBigDecimal("DISCOUNT"));
        data.setExtra_fee(resultSet.getLong("EXTRAFEE"));
        data.setNormal_sales(resultSet.getInt("NORMALSALES"));
        data.setEmail(resultSet.getString("EMAIL"));
        data.setNum_code(resultSet.getString("PAYCODE"));
        data.setOrg(resultSet.getString("STCODEORG"));
        data.setOrgname(resultSet.getString("STNAMEORG"));
        data.setSubclass(resultSet.getString("SUBCLASS"));
        data.setTrain_name(resultSet.getString("TRAINNAME"));
        data.setTrainclass(resultSet.getString("TRAINCLASS"));
        data.setTrain_no(resultSet.getString("NOKA"));
        data.setTransactionid(resultSet.getString("C_TRANSACTION_ID"));
        data.setStatus(resultSet.getString("STATUSDESC"));
        data.setCreatedby(resultSet.getString("CREATEDBY"));
        data.setLocalstat(resultSet.getString("LOCALSTAT"));
        data.setTripid(resultSet.getString("TRIPID"));
        data.setSubclassid(resultSet.getString("SUBCLASSID"));
        data.setScheduleid(resultSet.getString("SCHEDULEID"));
        data.setTransstatus(resultSet.getString("STATUS"));
        data.setCreatedon(LocalDateTime.parse(resultSet.getString("CREATEDON"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        List paxlist = new ArrayList();
        paxlist.add(resultSet.getString("PAXLIST_NAME"));
        paxlist.add(resultSet.getString("PAXLIST_PSGID"));
        paxlist.add(resultSet.getString("PAXLIST_PSGTYPE"));
        paxlist.add(resultSet.getString("PAXLIST_REDUCTIONNAME"));
        paxlist.add(resultSet.getString("PAXLIST_TICKETNUM"));
        paxlist.add(resultSet.getString("PAXLIST_WAGON"));
        paxlist.add(resultSet.getString("PAXLIST_SEAT"));
        paxlist.add(resultSet.getString("PAXLIST_TRANSDETID"));
        paxlist.add(resultSet.getString("PAXLIST_STATUS"));
        paxlist.add(resultSet.getString("PAXLIST_STATUSDESC"));
        paxlist.add(resultSet.getString("PAXLIST_AMOUNT"));
        data.setPax_list(paxlist);
        return data;
    }
}

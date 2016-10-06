/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mo
 */
public class RedeeminfoRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Redeeminfo data = new Redeeminfo();
        data.setMemberid(resultSet.getString("C_MEMBER_ID"));
        data.setMembershipid(resultSet.getString("C_MEMBERSHIP_ID"));
        data.setEndingbal(resultSet.getLong("ENDINGBAL"));
        data.setTicketamount(resultSet.getLong("TICKETAMOUNT"));
        data.setRedeemdiv(resultSet.getLong("REDEEMDIV"));
        data.setAmountconvert(resultSet.getInt("AMOUNTCONVERT"));
        return data;
    }
}

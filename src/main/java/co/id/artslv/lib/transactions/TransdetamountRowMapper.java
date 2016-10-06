/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Mo
 */
public class TransdetamountRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Transdetamount data = new Transdetamount();
        data.setRateamount(resultSet.getLong("RATEAMOUNT"));
        data.setDiscamount(resultSet.getLong("DISCAMOUNT"));
        data.setRedamount(resultSet.getLong("REDAMOUNT"));
        data.setAmount(resultSet.getLong("AMOUNT"));
        return data;
    }
}

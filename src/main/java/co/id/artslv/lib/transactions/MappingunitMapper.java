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
public class MappingunitMapper implements RowMapper<Object> {
    @Override
    public Object mapRow(ResultSet resultSet, int row) throws SQLException {
        Mappingunit data = new Mappingunit();
        data.setUnitname(resultSet.getString("C_UNIT_NAME"));
        data.setUnitcode(resultSet.getString("C_UNIT_CODE"));
        data.setIp(resultSet.getString("C_IP_IP"));
        data.setRqid(resultSet.getString("C_USER_RQID"));
        return data;
    }
}

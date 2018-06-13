/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public abstract class GenericDAO {

    protected void executeNoQuery(String sql, Object... parameters) throws Exception {
        PreparedStatement pstm = null;
        try {

            pstm = ConnectionManager.getInstance().getConnection().prepareStatement(sql);
            for (int i = 0; i < parameters.length; i++) {
                pstm.setObject(i + 1, parameters[i]);
            }
            
            pstm.execute();
            
        } catch (Exception e) {
            
            throw e;
            
        } finally {
            
            if (pstm != null) {
                pstm.close();
            }
            
            ConnectionManager.getInstance().getConnection().close();
        }
    }
}

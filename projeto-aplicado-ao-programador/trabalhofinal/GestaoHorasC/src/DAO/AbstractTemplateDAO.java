/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AbstractEntity;
import Model.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNOS
 * @param <E>
 */
public abstract class AbstractTemplateDAO<E> implements AbstractInterfaceDAO<E> {

    protected ConnectionManager db;

    public AbstractTemplateDAO() {
        this.db = ConnectionManager.getInstance();
    }
    
    /**
     * Retorna uma entidade a partir de um ResultSet do banco de dados.
     * 
     * @param rs
     * @return 
     */
    protected abstract E fromDocument(ResultSet rs);

    @Override
    public void persist(E entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<E> retrieveAll() {
        ArrayList<E> lista = new ArrayList<>();
        
        try {
            Connection conn = this.db.getConnection();
            Statement stat = conn.createStatement();
            
            try {
                String sql = "select * from " + AbstractEntity.getTable();
                
                ResultSet rs = stat.executeQuery(sql);
                
                while (rs.next()) {                    
                    lista.add(this.fromDocument(rs));
                }
            } catch (SQLException se) {
                throw new SQLException("Erro ao buscar dados no Banco de Dados! " + se.getMessage());
            } finally {
                stat.close();
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AbstractTemplateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
}

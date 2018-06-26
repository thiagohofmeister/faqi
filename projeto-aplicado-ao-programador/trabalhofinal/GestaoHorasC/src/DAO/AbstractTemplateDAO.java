/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    protected String collection;

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
    
    /**
     * Retorna uma string para inserir os dados no banco de dados.
     * 
     * @param entity
     * @return 
     */
    protected abstract String toDocument(E entity);

    @Override
    public int persist(E entity) {
        int id = 0;
        
        try {
            Connection conn = this.db.getConnection();
            Statement stat = conn.createStatement();
            
            String sql = "insert into " + collection + " values (" + this.toDocument(entity) + ")";
            
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                id = rs.getInt(1);
            }
            
        } catch (SQLException se) {
            
        }
        
        return id;
    }

    @Override
    public E findById(Long id) throws SQLException {
        Connection conn = this.db.getConnection();
        Statement stat = conn.createStatement();

        try {
            String sql = "select * from " + collection + " where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return this.fromDocument(rs);
            }
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados no Banco de Dados! " + se.getMessage());
        } finally {
            stat.close();
            conn.close();
        }
        
        throw new SQLException("Nenhum " + collection + " encontrado para o id: " + id);
    }

    @Override
    public ArrayList<E> retrieveAll() {
        ArrayList<E> lista = new ArrayList<>();
        
        try {
            Connection conn = this.db.getConnection();
            Statement stat = conn.createStatement();
            
            try {
                String sql = "select * from " + collection;
                
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

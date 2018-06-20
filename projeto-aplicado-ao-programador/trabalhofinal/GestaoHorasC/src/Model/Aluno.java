
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelagem de dados de Aluno.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Aluno extends AbstractEntity {
    private String telefone;
    private String nome;
    private String email;
    private String ra;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param rs
     * @return
     * @throws SQLException 
     */
    public static Aluno fromDocument (ResultSet rs) throws SQLException {
        Aluno entity = (new Aluno());
        
        entity.setId(rs.getInt("id"));
        entity.setRa(rs.getString("ra"));
        entity.setNome(rs.getString("nome"));
        entity.setEmail(rs.getString("email"));
        entity.setTelefone(rs.getString("telefone"));
        
        return entity;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param entity
     * @return 
     */
    public static String toDocument (Aluno entity) {
        String id = null;
        
        if (entity.getId() > 0) {
            id = Integer.toString(entity.getId());
        }
        
        return id + ",'" + 
                entity.getTelefone() + "','" + 
                entity.getNome() + "','" + 
                entity.getEmail() + "','" +
                entity.getRa() + "'";
    }

    @Override
    public String toString() {
        return "Telefone: " + telefone + 
               "\nNome: " + nome + 
               "\nEmail: " + email + 
               "\nRA: " + ra;
    }
}

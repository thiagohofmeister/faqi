
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelagem de dados de Curso.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Curso extends AbstractEntity {
    protected int totalDeHoras;
    protected String nome;
    protected int codigo;

    public int getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setTotalDeHoras(int totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param rs
     * @return
     * @throws SQLException 
     */
    public static Curso fromDocument (ResultSet rs) throws SQLException {
        Curso entity = (new Curso());
        
        entity.setId(rs.getInt("id"));
        entity.setCodigo(rs.getInt("codigo"));
        entity.setNome(rs.getString("nome"));
        entity.setTotalDeHoras(rs.getInt("totaldehoras"));
        
        return entity;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param entity
     * @return 
     */
    public static String toDocument (Curso entity) {
        String id = null;
        
        if (entity.getId() > 0) {
            id = Integer.toString(entity.getId());
        }
        
        return id + "," + 
                entity.getTotalDeHoras() + ",'" + 
                entity.getNome() + "','" + 
                entity.getCodigo()+ "'";
    }

    @Override
    public String toString() {
        return nome;
    }
}

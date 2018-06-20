
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelagem de dados de Tipo de Atividade.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class TipoAtividade extends AbstractEntity {
    protected double limiteHoras;
    protected String descricao;

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param rs
     * @return
     * @throws SQLException 
     */
    public static TipoAtividade fromDocument (ResultSet rs) throws SQLException {
        TipoAtividade entity = (new TipoAtividade());
        
        entity.setId(rs.getInt("id"));
        entity.setLimiteHoras(rs.getDouble("limiteHoras"));
        entity.setDescricao(rs.getString("descricao"));
        
        return entity;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param entity
     * @return 
     */
    public static String toDocument (TipoAtividade entity) {
        String id = null;
        
        if (entity.getId() > 0) {
            id = Integer.toString(entity.getId());
        }
        
        return id + "," + 
                entity.getLimiteHoras() + ",'" + 
                entity.getDescricao() + "'";
    }
}

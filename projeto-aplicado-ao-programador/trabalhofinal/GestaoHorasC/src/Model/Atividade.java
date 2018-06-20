
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelagem de dados de Atividade.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Atividade extends AbstractEntity {
    protected TipoAtividade tipoAtividade;
    protected Curso curso;
    protected int codigo;

    public TipoAtividade getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(TipoAtividade tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
    public static Atividade fromDocument (ResultSet rs) throws SQLException {
        Atividade entity = (new Atividade());
        
        TipoAtividade tipoAtividade = new TipoAtividade();
        tipoAtividade.setId(rs.getInt("idTipoAtividade"));
        
        Curso curso = new Curso();
        curso.setId(rs.getInt("idCurso"));
        
        entity.setId(rs.getInt("id"));
        entity.setCodigo(rs.getInt("codigo"));
        entity.setTipoAtividade(tipoAtividade);
        entity.setCurso(curso);
        
        return entity;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param entity
     * @return 
     */
    public static String toDocument (Atividade entity) {
        String id = null;
        
        if (entity.getId() > 0) {
            id = Integer.toString(entity.getId());
        }
        
        return id + "," + 
                entity.getTipoAtividade().getId() + "," + 
                entity.getCurso().getId() + ",'" + 
                entity.getCodigo()+ "'";
    }
}

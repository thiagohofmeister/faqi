
package DAO;

import Model.Atividade;
import Model.Curso;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class CursoDAO extends AbstractTemplateDAO<Curso> {  

    public CursoDAO() {
        this.collection = "Curso";
    }

    @Override
    public Curso fromDocument(ResultSet rs)  {
        try {
            return Curso.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new Curso());
    }

    @Override
    protected String toDocument(Curso entity) {        
        return Curso.toDocument(entity);
    }
}

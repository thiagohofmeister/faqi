
package DAO;

import Model.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunoDAO extends AbstractTemplateDAO<Aluno> {  

    public AlunoDAO() {
        this.collection = "Aluno";
    }

    @Override
    public Aluno fromDocument(ResultSet rs)  {
        try {
            return Aluno.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new Aluno());
    }

    @Override
    protected String toDocument(Aluno entity) {        
        return Aluno.toDocument(entity);
    }
}

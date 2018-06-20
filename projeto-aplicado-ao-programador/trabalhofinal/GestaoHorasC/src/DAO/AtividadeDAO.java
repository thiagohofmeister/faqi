
package DAO;

import Model.Aluno;
import Model.Atividade;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadeDAO extends AbstractTemplateDAO<Atividade> {  

    public AtividadeDAO() {
        this.collection = "Atividade";
    }

    @Override
    public Atividade fromDocument(ResultSet rs)  {
        try {
            return Atividade.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new Atividade());
    }

    @Override
    protected String toDocument(Atividade entity) {        
        return Atividade.toDocument(entity);
    }
}

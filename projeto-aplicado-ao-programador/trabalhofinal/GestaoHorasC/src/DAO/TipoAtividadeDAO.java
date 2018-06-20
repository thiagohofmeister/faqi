
package DAO;

import Model.TipoAtividade;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class TipoAtividadeDAO extends AbstractTemplateDAO<TipoAtividade> {  

    public TipoAtividadeDAO() {
        this.collection = "TipoAtividade";
    }

    @Override
    public TipoAtividade fromDocument(ResultSet rs)  {
        try {
            return TipoAtividade.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new TipoAtividade());
    }

    @Override
    protected String toDocument(TipoAtividade entity) {        
        return TipoAtividade.toDocument(entity);
    }
}

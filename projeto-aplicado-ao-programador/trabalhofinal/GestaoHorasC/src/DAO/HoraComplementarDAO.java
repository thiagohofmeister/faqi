
package DAO;

import Model.Curso;
import Model.HoraComplementar;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class HoraComplementarDAO extends AbstractTemplateDAO<HoraComplementar> {  

    public HoraComplementarDAO() {
        this.collection = "HoraComplementar";
    }

    @Override
    public HoraComplementar fromDocument(ResultSet rs)  {
        try {
            return HoraComplementar.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new HoraComplementar());
    }

    @Override
    protected String toDocument(HoraComplementar entity) {        
        return HoraComplementar.toDocument(entity);
    }
}

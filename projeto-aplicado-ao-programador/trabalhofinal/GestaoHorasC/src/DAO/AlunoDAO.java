
package DAO;

import Model.AbstractEntity;
import Model.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Abstração classes relacionadas ao banco de dados.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunoDAO extends AbstractTemplateDAO {  

    @Override
    public Aluno fromDocument(ResultSet rs)  {
        try {
            return Aluno.fromDocument(rs);
        } catch (SQLException ex) {
            // previne fatal error
        }
        
        return (new Aluno());
    }

}

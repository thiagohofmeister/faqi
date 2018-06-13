
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

    public Aluno() {
        this.table = "alunos";
    }

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
    
    public static Aluno fromDocument (ResultSet rs) throws SQLException {
        Aluno aluno = (new Aluno());
        
        aluno.setId(rs.getInt("id"));
        aluno.setRa(rs.getString("ra"));
        aluno.setNome(rs.getString("nome"));
        aluno.setEmail(rs.getString("email"));
        aluno.setTelefone(rs.getString("telefone"));
        
        return aluno;
    }
}

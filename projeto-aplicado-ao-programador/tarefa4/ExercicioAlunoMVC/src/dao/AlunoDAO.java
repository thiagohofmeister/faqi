
package dao;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunoDAO {
    private GerenciaDados db;
    
    public AlunoDAO() {
        this.db = GerenciaDados.getInstance();
    }
    
    public ArrayList<Aluno> buscarTodos()
    {
        return this.db.getListaAlunos();
    }
    
    public Aluno buscar(String ra)
    {
        for (Aluno a : this.db.getListaAlunos()) {
            if (a.getRa().equals(ra)) {
                return a;
            }
        }
        return new Aluno();
    }
}

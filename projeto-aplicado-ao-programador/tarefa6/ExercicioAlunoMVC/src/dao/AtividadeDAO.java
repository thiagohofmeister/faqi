
package dao;

import java.util.ArrayList;
import model.Aluno;
import model.Atividade;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadeDAO {
    private GerenciaDados db;
    
    public AtividadeDAO() {
        this.db = GerenciaDados.getInstance();
    }
    
    public ArrayList<Atividade> buscarTodos()
    {
        return this.db.getListaAtividades();
    }
    
    public Atividade buscar(String ra)
    {
        for (Atividade a : this.db.getListaAtividades()) {
            if (a.getAluno().getRa().equals(ra)) {
                return a;
            }
        }
        return new Atividade(new Aluno());
    }
}

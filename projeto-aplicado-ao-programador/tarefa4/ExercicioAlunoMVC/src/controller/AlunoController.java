
package controller;

import java.util.ArrayList;
import model.Aluno;
import dao.AlunoDAO;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunoController extends Controller {
    
    private AlunoDAO dao;
    
    public AlunoController() {
        this.dao = new AlunoDAO();
    }
    
    @Override
    public ArrayList<Aluno> listar ()
    {
        return this.dao.buscarTodos();
    }

    @Override
    public Aluno buscar(String ra) {
        return this.dao.buscar(ra);
    }
}

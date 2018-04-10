
package controller;

import dao.AtividadeDAO;
import java.util.ArrayList;
import model.Atividade;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadeController extends Controller {
    private AtividadeDAO dao;
    
    public AtividadeController() {
        this.dao = new AtividadeDAO();
    }
    
    @Override
    public ArrayList<Atividade> listar ()
    {
        return this.dao.buscarTodos();
    }

    @Override
    public Atividade buscar(String ra) {
        return this.dao.buscar(ra);
    }
    
}

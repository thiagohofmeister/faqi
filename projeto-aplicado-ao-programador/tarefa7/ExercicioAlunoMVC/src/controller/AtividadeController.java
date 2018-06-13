
package controller;

import dao.AtividadeDAO;
import java.sql.SQLException;
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
        ArrayList<Atividade> lista = new ArrayList<>();

        try {
            lista = this.dao.buscarTodos();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return lista;
    }

    @Override
    public Atividade buscar(String ra) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

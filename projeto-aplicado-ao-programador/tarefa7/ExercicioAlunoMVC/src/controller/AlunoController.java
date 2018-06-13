package controller;

import java.util.ArrayList;
import model.Aluno;
import dao.AlunoDAO;
import java.sql.SQLException;

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
    public ArrayList<Aluno> listar() {
        ArrayList<Aluno> lista = new ArrayList<>();

        try {
            lista = this.dao.buscarTodos();
        } catch (SQLException e) {
            lista = null;
        }

        return lista;
    }

    @Override
    public Aluno buscar(String ra) {
        Aluno aluno = new Aluno();
        
        try {
            aluno = this.dao.buscar(ra);
        } catch (SQLException e) {
            aluno = null;
        }
        
        return aluno;
    }

    @Override
    public Object buscarPorId(Integer id) {
        Aluno aluno = new Aluno();
        
        try {
            aluno = this.dao.buscarPorId(id);
        } catch (SQLException e) {
            aluno = null;
        }
        
        return aluno;
    }
}

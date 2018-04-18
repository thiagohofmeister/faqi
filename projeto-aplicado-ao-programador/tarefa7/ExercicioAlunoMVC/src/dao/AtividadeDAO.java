
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Aluno;
import model.Atividade;
import view.AtividadesView;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadeDAO {
    private ConnectionManager db;
    
    public AtividadeDAO() {
        this.db = ConnectionManager.getInstance();
    }
    
    public ArrayList<Atividade> buscarTodos() throws SQLException
    {
        Connection conn = this.db.getConnection();
        Statement stat = conn.createStatement();
        
        ArrayList<Atividade> lista = new ArrayList<>();

        try {
            String sql = "select * from atividade";

            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Atividade a = new Atividade();

                a.setNomeAtividade(rs.getString("nomeAtividade"));
                a.setHora(rs.getInt("hora"));
                
                Aluno aluno = (new AlunoDAO()).buscarPorId(rs.getInt("idAluno"));
                
                a.setAluno(aluno);

                lista.add(a);
            }
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados no Banco de Dados! " + se.getMessage());
        } finally {
            stat.close();
            conn.close();
        }

        return lista;
    }
}

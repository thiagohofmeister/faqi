package dao;

import java.util.ArrayList;
import model.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunoDAO {

    private ConnectionManager db;

    public AlunoDAO() {
        this.db = ConnectionManager.getInstance();
    }

    public ArrayList<Aluno> buscarTodos() throws SQLException {
        Connection conn = this.db.getConnection();
        Statement stat = conn.createStatement();
        
        ArrayList<Aluno> lista = new ArrayList<>();

        try {
            String sql = "select * from aluno";

            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Aluno a = new Aluno();
                a.setRa(rs.getString("ra"));
                a.setNome(rs.getString("nome"));

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

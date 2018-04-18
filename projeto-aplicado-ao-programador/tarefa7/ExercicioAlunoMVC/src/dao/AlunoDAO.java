package dao;

import java.util.ArrayList;
import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public Aluno buscar(String ra) throws SQLException {
        Connection conn = this.db.getConnection();
        Statement stat = conn.createStatement();

        Aluno aluno = new Aluno();

        try {
            String sql = "select * from aluno where ra = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(0, ra);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                aluno.setRa(rs.getString("ra"));
                aluno.setNome(rs.getString("nome"));
            }

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados no Banco de Dados! " + se.getMessage());
        } finally {
            stat.close();
            conn.close();
        }

        return aluno;
    }

    public Aluno buscarPorId(Integer id) throws SQLException {

        Connection conn = this.db.getConnection();
        Statement stat = conn.createStatement();

        Aluno aluno = new Aluno();

        try {
            String sql = "select * from aluno where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                aluno.setRa(rs.getString("ra"));
                aluno.setNome(rs.getString("nome"));
            }

        } catch (SQLException se) {
            System.out.println(se);
            throw new SQLException("Erro ao buscar dados no Banco de Dados! " + se.getMessage());
        } finally {
            stat.close();
            conn.close();
        }

        return aluno;
    }
}

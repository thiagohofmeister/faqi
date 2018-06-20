
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelagem de dados de Hora Complementar.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class HoraComplementar extends AbstractEntity {
    protected Aluno aluno;
    protected Atividade atividade;
    protected String data;
    protected String descricao;
    protected float totalHoras;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(float totalHoras) {
        this.totalHoras = totalHoras;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param rs
     * @return
     * @throws SQLException 
     */
    public static HoraComplementar fromDocument (ResultSet rs) throws SQLException {
        HoraComplementar entity = (new HoraComplementar());
        
        Aluno aluno = new Aluno();
        aluno.setId(rs.getInt("idAluno"));
        
        Atividade atividade = new Atividade();
        atividade.setId(rs.getInt("idAtividade"));
        
        entity.setId(rs.getInt("id"));
        entity.setAluno(aluno);
        entity.setAtividade(atividade);
        entity.setData(rs.getString("data"));
        entity.setTotalHoras(rs.getInt("totalHoras"));
        entity.setDescricao(rs.getString("descricao"));
        
        return entity;
    }
    
    /**
     * Retorna uma entidade de acordo com o result set do banco.
     * 
     * @param entity
     * @return 
     */
    public static String toDocument (HoraComplementar entity) {
        String id = null;
        
        if (entity.getId() > 0) {
            id = Integer.toString(entity.getId());
        }
        
        return id + "," + 
                entity.getAluno().getId() + "," + 
                entity.getAtividade().getId() + ",'" + 
                entity.getData()+ "','" +
                entity.getDescricao() + "'," +
                entity.getTotalHoras();
    }
}

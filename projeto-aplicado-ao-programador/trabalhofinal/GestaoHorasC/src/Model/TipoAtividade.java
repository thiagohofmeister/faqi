
package Model;

/**
 * Modelagem de dados de Tipo de Atividade.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class TipoAtividade extends AbstractEntity {
    protected Aluno aluno;
    protected Atividade atividade;
    protected String date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}

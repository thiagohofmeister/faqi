
package Model;

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
}


package Model;

/**
 * Modelagem de dados de Atividade.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Atividade extends AbstractEntity {
    protected TipoAtividade tipoAtividade;
    protected Curso curso;
    protected int codigo;

    public TipoAtividade getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(TipoAtividade tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

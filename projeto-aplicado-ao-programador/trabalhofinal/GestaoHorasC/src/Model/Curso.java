
package Model;

/**
 * Modelagem de dados de Curso.
 * 
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Curso extends AbstractEntity {
    protected int totalDeHoras;
    protected String nome;
    protected int codigo;

    public int getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setTotalDeHoras(int totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}


package model;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class Atividade {
    private Aluno aluno;
    private String nomeAtividade;
    private int hora;

    public Atividade(Aluno aluno, String nomeAtividade, int hora) {
        this.aluno = aluno;
        this.nomeAtividade = nomeAtividade;
        this.hora = hora;
    }
    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno + "\nNome Atividade: " + nomeAtividade + "\nHora: " + hora;
    }
}

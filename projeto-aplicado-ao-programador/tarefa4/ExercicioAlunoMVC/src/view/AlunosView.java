
package view;

import model.Aluno;
import dao.GerenciaDados;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AlunosView extends View {

    @Override
    public String mostrar() {
        String string = "";
        for (Aluno aluno : GerenciaDados.getInstance().getListaAlunos()) {
            string += aluno + "\n";
        }
        return string;
    }
    
}

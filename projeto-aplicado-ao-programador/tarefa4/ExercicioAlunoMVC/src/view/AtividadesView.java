
package view;

import model.Atividade;
import dao.GerenciaDados;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadesView extends View {

    @Override
    public String mostrar() {
        String string = "";
        for (Atividade atividade : GerenciaDados.getInstance().getListaAtividades()) {
            string += atividade + "\n";
        }
        return string;
    }
    
}

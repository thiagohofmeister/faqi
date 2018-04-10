/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Atividade;
import model.GerenciaDados;

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

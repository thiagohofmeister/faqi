/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Aluno;
import model.GerenciaDados;

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

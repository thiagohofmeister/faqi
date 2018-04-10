/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.AlunosView;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class AtividadeController extends Controller {
    
    @Override
    public String listar ()
    {
        return (new AlunosView()).mostrar();
    }
}

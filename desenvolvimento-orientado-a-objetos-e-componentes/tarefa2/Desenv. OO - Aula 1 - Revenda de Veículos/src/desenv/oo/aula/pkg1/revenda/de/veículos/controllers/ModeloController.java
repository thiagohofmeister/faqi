/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos.controllers;

import Entidades.Modelo;
import Views.ModeloView;
import desenv.oo.aula.pkg1.revenda.de.veículos.models.ModeloModel;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class ModeloController {

    
    private ModeloView view;
    
    private ModeloModel model;
    
    public ModeloController() {
        this.view = new ModeloView();
        this.model = new ModeloModel();
    }
    
    /**
     * Método principal dos modelos de veículos
     */
    public void index() {
        int opcao = this.view.menuPrincipal();
        
        switch (opcao) {
            case 1:
                this.listarModelos();
                break;
            case 2:
                this.cadastrarModelos();
                break;
            case 3:
                this.deletarModelos();
                break;
            case 9:
                HomeController home = new HomeController();
                home.index();
                return;
        }
        
        this.index();
    }

    public void listarModelos() {
        ArrayList<Modelo> modelos = this.model.buscarTodosModelos();
        
        this.view.listarDados(modelos);
    }

    private void cadastrarModelos() {
        Modelo modelo = this.view.cadastrarModelo();
        
        this.model.cadastrarModelo(modelo);
    }

    private void deletarModelos() {
        int codigoModelo = this.view.deletarModelo();
        
        this.model.deletarModeloPorCodigo(codigoModelo);
    }
    
}

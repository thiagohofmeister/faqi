/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos.controllers;

import Entidades.Marca;
import Views.MarcaView;
import desenv.oo.aula.pkg1.revenda.de.veículos.models.MarcaModel;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class MarcaController {

    private MarcaView view;
    
    private MarcaModel model;
    
    public MarcaController() {
        this.view = new MarcaView();
        this.model = new MarcaModel();
    }
    
    /**
     * Método principal da controller de marcas
     */
    public void index() {
        int opcao = this.view.menuPrincipal();
        
        switch (opcao) {
            case 1:
                this.listarMarcas();
                break;
            case 2:
                this.cadastrarMarca();
                break;
            case 3:
                this.deletarMarcas();
                break;
            case 9:
                HomeController home = new HomeController();
                home.index();
                return;
        }
        
        this.index();
    }

    /**
     * Método responsável por listar todas as marcas cadastradas no sistemas
     */
    public void listarMarcas() {
        ArrayList<Marca> marcas = this.model.buscarTodasMarcas();
        
        this.view.listarDados(marcas);
    }

    private void deletarMarcas() {
        int codigoMarca = this.view.deletarMarca();
        
        this.model.deletarMarcaPorCodigo(codigoMarca);
    }
    
    private void cadastrarMarca() {
        Marca marca = this.view.cadastrarMarca();
        
        this.model.cadastrarMarcar(marca);
    }
}

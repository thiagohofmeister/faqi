/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Veiculos.Veiculo;
import Views.VeiculoView;
import DAO.VeiculoDAO;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class VeiculoController {

    private VeiculoView view;
    
    private VeiculoDAO model;
    
    public VeiculoController() {
        this.view = new VeiculoView();
        this.model = new VeiculoDAO();
    }
    
    /**
     * Método principal da controller de marcas
     */
    public void index() {
        int opcao = this.view.menuPrincipal();
        
        switch (opcao) {
            case 1:
                this.listarVeiculos();
                break;
            case 2:
                this.cadastrarVeiculo();
                break;
            case 3:
                this.deletarVeiculos();
                break;
            case 9:
                HomeController home = new HomeController();
                home.index();
                return;
        }
        
        this.index();
    }

    /**
     * Método responsável por listar todos os veiculos cadastrados no sistemas
     */
    protected void listarVeiculos() {
        ArrayList<Veiculo> veiculos = this.model.buscarTodos();
        
        for (Veiculo veiculo : veiculos) {
            if (!veiculo.isDisponivel()) {
                veiculos.remove(veiculo);
            }
        }
        
        this.view.listarDados(veiculos);
    }

    private void deletarVeiculos() {
        int codigo = this.view.deletarVeiculos();
        
        this.model.deletarPorCodigo(codigo);
    }
    
    private void cadastrarVeiculo() {
        Veiculo veiculo = this.view.cadastrarVeiculo();
        
        this.model.cadastrar(veiculo);
    }
}

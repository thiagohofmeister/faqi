/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos.models;

import Entidades.Modelo;
import Entidades.Veiculos.Veiculo;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.GerenciaDeDados;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class ModeloModel {

    public ArrayList<Modelo> buscarTodosModelos() {
        return (GerenciaDeDados.getInstance()).getModelos();
    }

    /**
     * Método reponsável por apagar um modelo de veículo filtrando 
     * pelo seu código
     * @param codigoModelo 
     */
    public void deletarModeloPorCodigo(int codigoModelo) {
        for (Modelo modelo : (GerenciaDeDados.getInstance()).getModelos()) {
            if (modelo.getCodigo() == codigoModelo) {
                
                for (Veiculo veiculo : (GerenciaDeDados.getInstance()).getVeiculos()) {
                    if (veiculo.getModelo() == modelo) {
                        System.out.println("Impossível deletar modelo"
                                + " associado a um veiculo.");
                        
                        return;
                    }
                }
                
                (GerenciaDeDados.getInstance()).getModelos().remove(modelo);
                System.out.println("Modelo " + modelo.getNome() 
                        + " deletado com sucesso.");
                return;
            }
        }
        
        System.out.println("Modelo não encontrado.");
    }

    /**
     * Busca um modelo de acorod com seu código
     * @param codigo
     * @return 
     */
    public Modelo buscarModeloPorCodigo(int codigo) {
        for (Modelo modelo : (GerenciaDeDados.getInstance()).getModelos()) {
            if (modelo.getCodigo() == codigo) {
                return modelo;
            }
        }
        
        return null;
    }
    
    /**
     * Método responsável por cadastrar um novo modelo de veículo
     * @param modelo 
     */
    public void cadastrarModelo(Modelo modelo) {
        (GerenciaDeDados.getInstance()).getModelos().add(modelo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos.models;

import Entidades.Veiculos.Veiculo;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.GerenciaDeDados;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class VeiculoModel {

    /**
     * Retorna todos os veiculos persistidos
     * @return 
     */
    public ArrayList<Veiculo> buscarTodosVeiculos() {
        return (ArrayList<Veiculo>) (GerenciaDeDados.getInstance()).getVeiculos().clone();
    }

    /**
     * Apaga um veiculo filtrando pelo seu código cadastrado
     * @param codigoMarca 
     */
    public void deletarVeiculoPorCodigo(int codigoVeiculo) {
        for (Veiculo veiculo : (GerenciaDeDados.getInstance()).getVeiculos()) {
            if (veiculo.getCodigo() == codigoVeiculo) {
                (GerenciaDeDados.getInstance()).getVeiculos().remove(veiculo);
                System.out.println("Veiculo " + veiculo.toString() 
                        + " deletado com sucesso!");
                return;
            }
        }
        
        System.out.println("Veiculo não encontrado!");
    }

    /** 
     * Persiste um novo veiculo
     * @param marca 
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        (GerenciaDeDados.getInstance()).getVeiculos().add(veiculo);
    }
}

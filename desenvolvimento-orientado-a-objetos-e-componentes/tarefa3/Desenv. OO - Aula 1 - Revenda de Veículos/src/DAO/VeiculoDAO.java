/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Veiculos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class VeiculoDAO extends AbstractDAO<Veiculo>{

    @Override
    public ArrayList<Veiculo> buscarTodos() {
        return (ArrayList<Veiculo>) (GerenciadorDeDados.getInstance()).getVeiculos().clone();
    }

    @Override
    public Veiculo buscarPorCodigo(int codigo) {
        for (Veiculo veiculo : (GerenciadorDeDados.getInstance()).getVeiculos()) {
            if (veiculo.getCodigo() == codigo) {
                return veiculo;
            }
        }
        
        return null;
    }

    @Override
    public void deletarPorCodigo(int codigo) {
         for (Veiculo veiculo : (GerenciadorDeDados.getInstance()).getVeiculos()) {
            if (veiculo.getCodigo() == codigo) {
                (GerenciadorDeDados.getInstance()).getVeiculos().remove(veiculo);
                System.out.println("Veiculo " + veiculo.toString() 
                        + " deletado com sucesso!");
                return;
            }
        }
        
        System.out.println("Veiculo não encontrado!");
    }

    @Override
    public void cadastrar(Veiculo entidade) {
        (GerenciadorDeDados.getInstance()).getVeiculos().add(entidade);
    }
}

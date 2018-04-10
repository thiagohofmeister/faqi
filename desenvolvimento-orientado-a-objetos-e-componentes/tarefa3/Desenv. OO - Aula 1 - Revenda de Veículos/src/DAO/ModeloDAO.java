/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Modelo;
import Entidades.Veiculos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class ModeloDAO extends AbstractDAO<Modelo>{

    @Override
    public ArrayList<Modelo> buscarTodos() {
        return (GerenciadorDeDados.getInstance()).getModelos();
    }

    @Override
    public Modelo buscarPorCodigo(int codigo) {
        for (Modelo modelo : (GerenciadorDeDados.getInstance()).getModelos()) {
            if (modelo.getCodigo() == codigo) {
                return modelo;
            }
        }
        
        return null;
    }

    @Override
    public void deletarPorCodigo(int codigo) {
        for (Modelo modelo : (GerenciadorDeDados.getInstance()).getModelos()) {
            if (modelo.getCodigo() == codigo) {
                
                for (Veiculo veiculo : (GerenciadorDeDados.getInstance()).getVeiculos()) {
                    if (veiculo.getModelo() == modelo) {
                        System.out.println("Impossível deletar modelo"
                                + " associado a um veiculo.");
                        
                        return;
                    }
                }
                
                (GerenciadorDeDados.getInstance()).getModelos().remove(modelo);
                System.out.println("Modelo " + modelo.getNome() 
                        + " deletado com sucesso.");
                return;
            }
        }
        
        System.out.println("Modelo não encontrado.");
    }

    @Override
    public void cadastrar(Modelo entidade) {
        (GerenciadorDeDados.getInstance()).getModelos().add(entidade);
    }
    
}

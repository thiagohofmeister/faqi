/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Marca;
import Entidades.Veiculos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class MarcaDAO extends AbstractDAO<Marca> {
    
    @Override
    public ArrayList<Marca> buscarTodos() {
        return (GerenciadorDeDados.getInstance()).getMarcas();
    }

    @Override
    public Marca buscarPorCodigo(int codigo) {
        for (Marca marca : (GerenciadorDeDados.getInstance()).getMarcas()) {
            if (marca.getCodigo() == codigo) {
                return marca;
            }
        }
        
        return null;
    }

    @Override
    public void deletarPorCodigo(int codigo) {
        for (Marca marca : (GerenciadorDeDados.getInstance()).getMarcas()) {
            if (marca.getCodigo() == codigo) {
                
                for (Veiculo veiculo : (GerenciadorDeDados.getInstance()).getVeiculos()) {
                    if (veiculo.getMarca()== marca) {
                        System.out.println("Impossível deletar marca"
                                + " associado a um veiculo.");
                        
                        return;
                    }
                }
                
                (GerenciadorDeDados.getInstance()).getMarcas().remove(marca);
                System.out.println("Marca " + marca.getNome() + " deletada com"
                + " sucesso!");
                return;
            }
        }
        
        System.out.println("Marca não encontrada!");
    }

    @Override
    public void cadastrar(Marca entidade) {
        ArrayList<Marca> marcas = GerenciadorDeDados.getInstance().getMarcas();
        marcas.add(entidade);
    }
}

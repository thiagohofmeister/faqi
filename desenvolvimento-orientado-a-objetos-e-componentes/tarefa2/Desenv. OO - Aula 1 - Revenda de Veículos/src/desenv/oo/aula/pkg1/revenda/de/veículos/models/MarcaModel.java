/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenv.oo.aula.pkg1.revenda.de.veículos.models;

import Entidades.Marca;
import Entidades.Veiculos.Veiculo;
import desenv.oo.aula.pkg1.revenda.de.veículos.controllers.GerenciaDeDados;
import java.util.ArrayList;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class MarcaModel {

    /**
     * Retorna todas as marcas persistidas
     * @return 
     */
    public ArrayList<Marca> buscarTodasMarcas() {
        return (GerenciaDeDados.getInstance()).getMarcas();
    }

    /**
     * Apaga uma marca filtrando pelo seu código cadastrado
     * @param codigoMarca 
     */
    public void deletarMarcaPorCodigo(int codigoMarca) {
        for (Marca marca : (GerenciaDeDados.getInstance()).getMarcas()) {
            if (marca.getCodigo() == codigoMarca) {
                
                for (Veiculo veiculo : (GerenciaDeDados.getInstance()).getVeiculos()) {
                    if (veiculo.getMarca()== marca) {
                        System.out.println("Impossível deletar marca"
                                + " associado a um veiculo.");
                        
                        return;
                    }
                }
                
                (GerenciaDeDados.getInstance()).marcas.remove(marca);
                System.out.println("Marca " + marca.getNome() + " deletada com"
                + " sucesso!");
                return;
            }
        }
        
        System.out.println("Marca não encontrada!");
    }

    /**
     * Busca uma marca de acorod com seu código
     * @param codigo
     * @return 
     */
    public Marca buscarMarcaPorCodigo(int codigo) {
        for (Marca marca : (GerenciaDeDados.getInstance()).getMarcas()) {
            if (marca.getCodigo() == codigo) {
                return marca;
            }
        }
        
        return null;
    }
    
    /** 
     * Persiste uma nova marca
     * @param marca 
     */
    public void cadastrarMarcar(Marca marca) {
        (GerenciaDeDados.getInstance()).marcas.add(marca);
    }
}

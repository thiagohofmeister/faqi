/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Veiculos;

import Entidades.Elements.VeiculoTipoEnum;
import Entidades.Marca;
import Entidades.Modelo;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class Carro extends Veiculo 
{
    int numeroPortas;
    
    String opcionais;

    public Carro(
            Marca marca, 
            Modelo modelo, 
            VeiculoTipoEnum tipo, 
            float preco, 
            int ano, 
            boolean disponivel, 
            int codigo, 
            int numeroPortas, 
            String opcionais
    ) {
        super(marca, modelo, tipo, preco, ano, disponivel, codigo);
        this.numeroPortas = numeroPortas;
        this.opcionais = opcionais;
    }
    
    public Carro(){};
    
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public Carro setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        return this;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public Carro setOpcionais(String opcionais) {
        this.opcionais = opcionais;
        return this;
    }

    @Override
    public String toString() {
        return "Carro{" + "numeroPortas=" + numeroPortas + ", opcionais=" 
                + opcionais + ", " + super.toString() + '}';
    }


    
}

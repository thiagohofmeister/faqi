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
public class Moto extends Veiculo 
{
    int cilindradas;
    
    String estilo;

    public Moto(
            Marca marca, 
            Modelo modelo, 
            VeiculoTipoEnum tipo, 
            float preco, 
            int ano, 
            boolean disponivel, 
            int codigo,
            int cilindradas, 
            String estilo
    ) {
        super(marca, modelo, tipo, preco, ano, disponivel, codigo);
        this.cilindradas = cilindradas;
        this.estilo = estilo;
    }

    public Moto(){};
    
    public int getCilindradas() {
        return cilindradas;
    }

    public Moto setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
        return this;
    }

    public String getEstilo() {
        return estilo;
    }

    public Moto setEstilo(String estilo) {
        this.estilo = estilo;
        return this;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindradas=" + cilindradas + ", estilo=" + estilo 
                + ", " + super.toString() + '}';
    }


}

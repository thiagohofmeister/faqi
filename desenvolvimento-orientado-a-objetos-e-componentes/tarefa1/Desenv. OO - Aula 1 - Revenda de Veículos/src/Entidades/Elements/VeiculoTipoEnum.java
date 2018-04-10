/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Elements;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public enum VeiculoTipoEnum {
    CARRO (1), MOTO (2);
    
    public int tipoVeiculo;
    
    VeiculoTipoEnum(int tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}

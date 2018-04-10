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
public abstract class Veiculo {
    
    Marca marca;
    
    Modelo modelo;
    
    VeiculoTipoEnum tipo;
    
    float preco;
    
    int ano;
    
    boolean disponivel;
    
    int codigo;

    /**
     * 
     * @param marca Marca do veiculo
     * @param modelo Modelo do veículo
     * @param tipo Tipo do veículo
     * @param preco
     * @param ano
     * @param disponivel
     * @param codigo 
     */
    public Veiculo(
            Marca marca, 
            Modelo modelo, 
            VeiculoTipoEnum tipo, 
            float preco, 
            int ano, 
            boolean disponivel, 
            int codigo
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
        this.ano = ano;
        this.disponivel = disponivel;
        this.codigo = codigo;
    }

    public Veiculo(){};
    
    public Marca getMarca() {
        return marca;
    }

    public Veiculo setMarca(Marca marca) {
        this.marca = marca;
        return this;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Veiculo setModelo(Modelo modelo) {
        this.modelo = modelo;
        return this;
    }

    public VeiculoTipoEnum getTipo() {
        return tipo;
    }

    public Veiculo setTipo(VeiculoTipoEnum tipo) {
        this.tipo = tipo;
        return this;
    }

    public float getPreco() {
        return preco;
    }

    public Veiculo setPreco(float preco) {
        this.preco = preco;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public Veiculo setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Veiculo setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public int getCodigo() {
        return codigo;
    }

    public Veiculo setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    } 

    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo + ", tipo=" 
                + tipo + ", preco=" + preco + ", ano=" + ano + ", disponivel=" 
                + disponivel + ", codigo=" + codigo;
    }
    
}

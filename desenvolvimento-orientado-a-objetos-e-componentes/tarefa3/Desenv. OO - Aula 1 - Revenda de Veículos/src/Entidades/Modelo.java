/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class Modelo {
    
    int codigo;
    
    String nome;

    public Modelo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Modelo setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Modelo setNome(String nome) {
        this.nome = nome;
        return this;
    }
    
    @Override
    public String toString()
    {
        return this.nome + " - " + this.codigo;
    }
    
    
}

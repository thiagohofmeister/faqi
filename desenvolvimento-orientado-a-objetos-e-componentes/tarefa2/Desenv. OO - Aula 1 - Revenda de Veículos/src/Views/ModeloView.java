/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entidades.Modelo;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class ModeloView extends View
{
    public int menuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar Modelos");
        System.out.println("2 - Cadastrar Modelos");
        System.out.println("3 - Deletar Modelos");
        System.out.println("9 - Voltar \n");
        
        int option = this.reader.nextInt();
        
        return option;
    }

    public int deletarModelo() {
        System.out.println("Digite o código do modelo que deseja apagar:");
        
        return this.reader.nextInt();
    }

    public Modelo cadastrarModelo() {
        System.out.println("Digite o código do modelo:");
        int codigo = this.reader.nextInt();
        
        this.reader.nextLine();
        
        System.out.println("Digite o nome do modelo:");
        String titulo = this.reader.nextLine();
        
        return new Modelo(codigo, titulo);
    }
}

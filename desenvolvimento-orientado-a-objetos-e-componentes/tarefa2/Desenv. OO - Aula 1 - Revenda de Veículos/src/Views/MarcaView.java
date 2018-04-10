/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entidades.Marca;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class MarcaView extends View
{
    public int menuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar Marcas");
        System.out.println("2 - Cadastrar Marca");
        System.out.println("3 - Deletar Marca");
        System.out.println("9 - Voltar \n");
        
        int option = this.reader.nextInt();
        
        return option;
    }

    public int deletarMarca() {
        System.out.println("Digite o código da marca que deseja apagar:");
        
        return this.reader.nextInt();
    }

    public Marca cadastrarMarca() {
        System.out.println("Digite o código da marca:");
        int codigo = this.reader.nextInt();
        
        this.reader.nextLine();
        
        System.out.println("Digite o nome da marca:");
        String titulo = this.reader.nextLine();
        
        return new Marca(codigo, titulo);
    }
}

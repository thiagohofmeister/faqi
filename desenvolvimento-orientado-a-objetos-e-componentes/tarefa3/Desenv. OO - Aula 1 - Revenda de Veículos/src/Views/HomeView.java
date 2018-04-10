/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public class HomeView extends View
{
    @Override
    public int menuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Marcas");
        System.out.println("2 - Modelos");
        System.out.println("3 - Veiculos");
        System.out.println("9 - Sair");
        
        int option = this.reader.nextInt();
        
        return option;
    }
}

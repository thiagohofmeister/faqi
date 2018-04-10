/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiago Hofmeister
 * @author Charles Oliveira
 */
public abstract class View<T> {
    
    Scanner reader;

    public View() {
         this.reader = new Scanner(System.in);
    }
    
    public void listarDados(ArrayList<T> lista)
    {
        for (T item : lista) {
            System.out.println(item.toString());
        }
        System.out.println("\n");
    }
}


package view;

import java.util.Scanner;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public abstract class View {
    final Scanner leitor = new Scanner(System.in);
    
    public abstract String mostrar();
}


package view;

import controller.AlunoController;
import model.GerenciaDados;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class MainView extends View {   
    
    @Override
    public void mostrar() {
        
        int option;
        
        do {
            System.out.println("-------Menu-------");
            //System.out.println("1 - Ler alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Listar atividades");
            //System.out.println("3 - Ordenar alunos por RA");
            //System.out.println("4 - Registra horas");
            //System.out.println("5 - Listar banco de horas");
            System.out.println("0 - Sair");
            System.out.print("\nTecle a sua opção: ");
            
            option = this.leitor.nextInt();
            
            (new AlunoController()).action(option);
            
        } while (option != 0);
    }
}

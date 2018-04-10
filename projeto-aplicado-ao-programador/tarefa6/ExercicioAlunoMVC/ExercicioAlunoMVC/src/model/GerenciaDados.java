
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thiago Hofmeister
 * @author Tiago Silveira
 */
public class GerenciaDados {
    
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();
    private static GerenciaDados instance;

    private GerenciaDados() {
        this.carregaDados();
    }
    
    public static GerenciaDados getInstance ()
    {
        if (instance == null) {
            instance = new GerenciaDados();
        }
        return instance;
    }
    
    private void carregaDados ()
    {
        String nome;
        int ra;
        Scanner ler = new Scanner(getClass().getResourceAsStream("alunos.txt"));
        
        while(ler.hasNext()) {
            
            nome = ler.nextLine();
            ra = ler.nextInt();
            ler.nextLine();
            
            listaAlunos.add(new Aluno(nome, ra));
        }
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}

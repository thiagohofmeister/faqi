
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
    private ArrayList<Atividade> listaAtividades = new ArrayList<>();
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
        String ra;
        Scanner ler = new Scanner(getClass().getResourceAsStream("alunos.txt"));
        
        while(ler.hasNext()) {
            
            nome = ler.nextLine();
            ra = ler.nextLine();
            
            listaAlunos.add(new Aluno(nome, ra));
        }
        
        String nomeAtividade;
        int hora;
        Aluno aluno;
        Scanner ler2 = new Scanner(getClass().getResourceAsStream("atividades.txt"));
                
        while(ler2.hasNext()) {
            
            ra = ler2.nextLine();
            nomeAtividade = ler2.nextLine();
            hora = ler2.nextInt();
            ler2.nextLine();
            
            try {
                aluno = this.getAluno(ra);
                listaAtividades.add(new Atividade(aluno, nomeAtividade, hora));
            } catch (Exception e) {
                // previne fatal error
            }
        }
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public ArrayList<Atividade> getListaAtividades() {
        return listaAtividades;
    }
    
    public Aluno getAluno (String ra) throws Exception {
               
        for (Aluno aluno : listaAlunos) {
            if (aluno.getRa().equals(ra)) {
                return aluno;
            }
        }
        
        throw new Exception("Aluno não encontrado!");
    }
}

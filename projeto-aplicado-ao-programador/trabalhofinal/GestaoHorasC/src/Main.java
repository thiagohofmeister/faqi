
import DAO.AlunoDAO;
import Model.AbstractEntity;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNOS
 */
public class Main {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        ArrayList<AbstractEntity> lista = alunoDAO.retrieveAll();
        
        for (AbstractEntity aluno : lista)
        {    
            System.out.println(aluno);
        }
    }
}
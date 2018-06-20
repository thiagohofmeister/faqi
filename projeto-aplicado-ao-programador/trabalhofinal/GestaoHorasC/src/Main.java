
import DAO.AlunoDAO;
import Model.AbstractEntity;
import Model.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Aluno aluno = new Aluno();
        
        aluno.setTelefone("51 994017101");
        aluno.setNome("Jurema2");
        aluno.setRa("12312313");
        aluno.setEmail("jurema@gmail.com");
            
        alunoDAO.persist(aluno);
    }
}
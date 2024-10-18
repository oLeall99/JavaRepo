/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DAO.Conexao;
import DAO.AlunoDao;
import model.Aluno;
import view.CadastroFrame;


/**
 *
 * @author unifamussio
 */
public class ControllerCadastro {
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    
    public void salvarAluno(){
        String nome = view.getTxtName().getText();
        String user = view.getTxtUser().getText();
        String password = view.getTxtSenha().getText();
        Aluno aluno = new Aluno(nome, user, password);
        Conexao c = new Conexao();
        try{
            Connection conn = c.getConnection();
            AlunoDao dao = new AlunoDao(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Aluno cadastrado aeeeeeeeeeeee!",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(
                    view, 
                    "Aluno não cadastrado!",
                    "Erro", 
                    JOptionPane.INFORMATION_MESSAGE);
        }    
    }
}

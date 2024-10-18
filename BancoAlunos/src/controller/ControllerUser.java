package controller;

import model.Aluno;
import view.UserFrame;
import DAO.Conexao;
import DAO.AlunoDao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerUser {
    private UserFrame view;
    private Aluno aluno;

    public ControllerUser(UserFrame view, Aluno aluno) {
        this.view = view;
        this.aluno = aluno;
    }
    
    public void update(){
        String user = view.getTxtUser().getText();
        String newPassword = view.getTxtNewPassword().getText();
        Aluno aluno = new Aluno("", user, newPassword);
        Conexao c = new Conexao();
        
        try{
            Connection conn = c.getConnection();
            AlunoDao dao = new AlunoDao(conn);
            dao.atualizar(aluno);
            JOptionPane.showMessageDialog(
                view, 
                "Senha Alterada!",
                "Aviso",
                JOptionPane.INFORMATION_MESSAGE
            );
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(
                view, 
                "Senha não alterada!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void excluir(){
        int option = JOptionPane.showConfirmDialog(
            view, 
            "Deseja realmente excluir?",
            "Aviso",
            JOptionPane.YES_NO_OPTION
        );
        
        if(option != 1){
            Conexao c = new Conexao();
            
            try{
                Connection conn = c.getConnection();
                AlunoDao dao = new AlunoDao(conn);
                dao.excluir(aluno);
                JOptionPane.showMessageDialog(
                    view,
                    "Aluno excluído!",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
                );
            
            } catch (SQLException e){
                JOptionPane.showMessageDialog(
                    view, 
                    "Aluno não excluído!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}

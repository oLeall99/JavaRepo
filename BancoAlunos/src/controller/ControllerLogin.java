package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DAO.Conexao;
import DAO.AlunoDao;
import model.Aluno;
import view.LoginFrame;

public class ControllerLogin {
    private LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }
    
    public void loginAluno(){
        Aluno aluno = new Aluno(
            null, 
            view.getTxtUser().getText(),
            view.getTxtPassword().getText()
        );
        
        Conexao conexao = new Conexao();
        
        try {
            Connection conn = conexao.getConnection();
            AlunoDao dao = new AlunoDao(conn);
            ResultSet res = dao.consultar(aluno);
            
            if(res.next()){
                JOptionPane.showMessageDialog(
                        view, 
                        "Login Efetuado!", 
                        "Aviso", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
            else{
                JOptionPane.showMessageDialog(
                    view, 
                    "Login Efetuado!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(
                view, 
                "Erro de Conexão!", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}

package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DAO.Conexao;
import DAO.AlunoDao;
import model.Aluno;
import view.LoginFrame;
import view.UserFrame;

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
                String nome = res.getString("nome");
                String usuario = res.getString("usuario");
                String senha = res.getString("senha");
                
                Aluno aluno1 = new Aluno(nome, usuario, senha);
                UserFrame uf = new UserFrame(aluno1);
                uf.setVisible(true);
                view.setVisible(false);
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

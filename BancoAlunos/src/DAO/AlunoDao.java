package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Aluno;

public class AlunoDao {
   private Connection conn;

    public AlunoDao(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException {
//        String sql = "select * from alunos where usuario = '"
//                + aluno.getUser() + "' AND senha = '"
//                + aluno.getPassword() + "'";
        
        String sql = "select * from alunos where usuario = ? AND senha = ?"; 
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,aluno.getUser());
        statement.setString(2,aluno.getPassword());
        statement.execute();
        ResultSet res = statement.getResultSet();
        
        return res;
    }
    
    public void inserir(Aluno aluno) throws SQLException{
        String sql = "insert into alunos (nome, usuario, senha) values ('"
                +aluno.getName() + "', '"
                +aluno.getUser() + "', '"
                +aluno.getPassword() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
} 

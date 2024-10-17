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
        String sql = "select * from aluno where usuario = '"
                + aluno.getUser() + "' AND senha = '"
                + aluno.getPassword() + "'";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        ResultSet res = statement.getResultSet();
        
        return res;
    }
} 

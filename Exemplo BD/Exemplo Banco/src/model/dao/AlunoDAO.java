/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoDAO {
        Connection con;
        
        public void inserirAluno(Aluno a) throws SQLException {
            con = new Conexao().getConnection();
            String sql = "Insert into AlunosJava (RA, NOME) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getRa());
            stmt.setString(2, a.getNome());
            stmt.execute();
            stmt.close();
            con.close();
        }
}

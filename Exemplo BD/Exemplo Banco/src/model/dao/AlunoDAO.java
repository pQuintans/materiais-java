/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        
        public void excluir(int ra) throws SQLException {
            con = new Conexao().getConnection();
            String sql = "DELETE FROM AlunosJava WHERE RA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, ra);
            stmt.execute();
            stmt.close();
            con.close();
        }
        
        public ArrayList<Aluno> buscarAlunos() throws SQLException {
            ResultSet rs;
            ArrayList<Aluno> lista = new ArrayList();
            
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM  AlunosJava";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int ra = rs.getInt("RA");
                String nome = rs.getString("NOME");
                Aluno al = new Aluno(ra, nome);
                lista.add(al);
            }
            stmt.close();
            con.close();
            return lista;
        }
}

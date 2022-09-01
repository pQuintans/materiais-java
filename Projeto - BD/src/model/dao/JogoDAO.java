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
import model.Jogo;

/**
 *
 * @author aluno
 */
public class JogoDAO {
    Connection con;
        
    public void insert(Jogo jogo) throws SQLException {
        con = new Conexao().getConnection();
        
        String sql = "INSERT INTO jogos (codigo, nome, ano_lancamento, genero, preco, descricao) VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, jogo.getCodigo());
        stmt.setString(2, jogo.getNome());
        stmt.setInt(3, jogo.getAnoLancamento());
        stmt.setString(4, jogo.getGenero());
        stmt.setFloat(5, jogo.getPreco());
        stmt.setString(6, jogo.getDescricao());
        
        stmt.execute();
        stmt.close();
        con.close();        
    }
    
    public void delete(int codigo) throws SQLException {
        con = new Conexao().getConnection();
        
        String sql = "DELETE FROM jogos WHERE codigo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, codigo);
        
        stmt.execute();
        stmt.close();
        con.close();        
    }
}

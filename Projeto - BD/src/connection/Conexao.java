/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    public Connection getConnection() {
        String url = "jdbc:mysql://143.106.241.3:3306/cl200126";
        String usuario = "cl200126";
        String senha = "cl*27112004";
        
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão " + ex.toString());
            exit (1);
            return null;
        }
    }
}

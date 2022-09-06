/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Jogo;
import model.dao.JogoDAO;

/**
 *
 * @author aluno
 */
public class JogoController {
    private ArrayList<Jogo> jogos;
    private JogoDAO jogoDAO;
    
    public JogoController() {
        jogos = new ArrayList();
        jogoDAO = new JogoDAO();
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }
    
     public String JogoCadastro(String nome, int anoLancamento, String genero, float preco, String descricao) throws SQLException{
        Jogo jogo = new Jogo(nome, anoLancamento, genero, preco, descricao);
        jogoDAO.insert(jogo);
        
        return "Jogo cadastrado com sucesso";
    }
     
     public int jogoGetCodigoAtual(){
         return Jogo.getNumeroJogos();
     }
     
     public void jogoExcluir(int codigo) throws SQLException{
        jogoDAO.delete(codigo);
    }

    public ArrayList<Jogo> jogoBuscar(String nome) throws SQLException{
        ArrayList<Jogo> jogos = jogoDAO.buscaJogo(nome);
        return jogos;
    }

    public ArrayList<Jogo> jogoBuscarTodos() throws SQLException {
        ArrayList<Jogo> jogos = jogoDAO.buscaJogos();
        return jogos;
    }
}

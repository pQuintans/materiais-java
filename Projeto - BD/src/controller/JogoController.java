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

    public String jogoBuscar(int busca){
        String resposta = "";

        for(Jogo c: jogos) {
            if(c.getDescricao().toUpperCase().startsWith(busca)){
                resposta = resposta.concat(c.getNome() + " - " + c.getDescricao() + "\n");
            }
        }

        if(resposta.equals("")) {
            resposta = "Nenhum jogo encontrado";
        }

        return resposta;
    }

    public String jogoMaisCaro(){
        float maiorPreco = 0;
        String resposta = "";

        for(Jogo j: jogos){
            if(j.getPreco() > maiorPreco){
                maiorPreco = j.getPreco();
                resposta = j.getNome() + " - " +  Float.toString(j.getPreco()) + "\n";
            } else if (j.getPreco() == maiorPreco) {
                resposta = resposta.concat(j.getNome() + " - " +  Float.toString(j.getPreco()) + "\n");
            }
        }

        return resposta;
    }

    public String jogoMaisBarato(){
        float menorPreco = -1;
        String resposta = "";

        for(Jogo j: jogos){
            if(j.getPreco() < menorPreco || menorPreco == -1){
                menorPreco = j.getPreco();
                resposta = j.getNome() + " - " +  Float.toString(j.getPreco()) + "\n";
            } else if (j.getPreco() == menorPreco) {
                resposta = resposta.concat(j.getNome() + " - " +  Float.toString(j.getPreco()) + "\n");
            }
        }

        return resposta;
    }

    public float jogoMediaPrecos(){
        float idadeTotal = 0;

        for (Jogo j: jogos){
            idadeTotal += j.getPreco();
        }

        return (float) idadeTotal/jogos.size();
    }

    public int jogoQuantidadeAcimaMediaPreco(){
        float media = jogoMediaPrecos();
        int jogosAcimaMedia = 0;
        for (Jogo j: jogos) {
            if(j.getPreco() > media) {
                jogosAcimaMedia++;
            }
        }

        return jogosAcimaMedia;
    }
}

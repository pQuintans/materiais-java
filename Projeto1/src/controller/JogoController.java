/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;
import model.Jogo;

/**
 *
 * @author aluno
 */
public class JogoController {
    private ArrayList<Jogo> jogos;
    
    public JogoController() {
        jogos = new ArrayList();
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }
    
     public String JogoCadastro(String nome, int anoLancamento, String genero, float preco, String descricao){
        int codigo = jogos.size() + 1;
        Jogo jogo = new Jogo(codigo, nome, anoLancamento, genero, preco, descricao);
        jogos.add(jogo);
        
        return "Jogo cadastrado com sucesso";
    }
     
     public int jogoExcluir(int codigo){
        int actualRow = 0;
        int response = -1;
        
        for(Jogo j: jogos){
            if(j.getCodigo() == codigo){
                response = actualRow;
                
                jogos.remove(j);
                break;
            }
            actualRow++;
        } 
        
        return response;
    }

    public String jogoBuscar(String filtro, String busca){
        String resposta = "";
        busca = busca.toUpperCase();

        for(Jogo c: jogos) {
            if(filtro.equals("Descrição")){
                if(c.getDescricao().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getNome() + " - " + c.getDescricao() + "\n");
                }
            } else if (filtro.equals("Ano Lançamento")){
                if(c.getAnoLancamento() == Integer.parseInt(busca)){
                    resposta = resposta.concat(c.getAnoLancamento() + " - " + c.getNome() + "\n");
                }
            } else if (filtro.equals("Nome")){
                if(c.getNome().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getNome() + "\n");
                }
            } else if (filtro.equals("Gênero")){
                if(c.getGenero().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getGenero()+ " - " + c.getNome() + "\n");
                }
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

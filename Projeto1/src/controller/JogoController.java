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
    
     public String JogoCadastro(String nome, int anoLancamento, String genero, float preco){
        int codigo = jogos.size() + 1;
        Jogo jogo = new Jogo(codigo, nome, anoLancamento, genero, preco);
        jogos.add(jogo);
        
        return "Jogo cadastrado com sucesso";
    }
     
     public int clienteExcluir(int codigo){
        boolean jogoExcluido = false;
        String nome = "";
        int actualRow = 0;
        int response = -1;
        
        for(Jogo j: jogos){
            if(j.getCodigo() == codigo){
                nome = j.getNome();
                jogoExcluido = true;
                response = actualRow;
                
                jogos.remove(j);
                break;
            }
            actualRow++;
        } 
        
        return response;
    } 
    
     public int clienteVerificar(String cpf){        
        for(Cliente c: clientes){
            if(c.getCpf().equals(cpf)){
               return 1;
            }
        }
        return 0;
    }
    
}

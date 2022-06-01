/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteController {
    private ArrayList<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public String clienteCadastro(String nome, int idade, String cpf, String email, String endereco){
        Cliente cliente = new Cliente(nome, idade, cpf, email, endereco);
        clientes.add(cliente);
        
        return "Cliente cadastrado com sucesso";
    }
    
    public int clienteExcluir(String cpf){
        boolean clienteExcluido = false;
        String nome = "";
        int actualRow = 0;
        int response = -1;
        
        for(Cliente c: clientes){
            if(c.getCpf().equals(cpf)){
                nome = c.getNome();
                clienteExcluido = true;
                response = actualRow;
                
                clientes.remove(c);
                break;
            }
            actualRow++;
        } 
        
        return response;
    }    
    
    public String clienteBuscar(String filtro, String busca){
        String resposta = "";
        busca = busca.toUpperCase();
        
        for(Cliente c: clientes) {
            if(filtro.equals("CPF")){      
                if(c.getCpf().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getCpf() + " - " + c.getNome() + "\n");
                }
            } else if (filtro.equals("Nome")){     
                if(c.getNome().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getNome() + "\n");
                }
            } else if (filtro.equals("Endereço")){     
                if(c.getEndereco().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getEndereco() + " - " + c.getNome() + "\n");
                }
            } else if (filtro.equals("E-mail")){     
                if(c.getEmail().toUpperCase().startsWith(busca)){
                    resposta = resposta.concat(c.getEmail()+ " - " + c.getNome() + "\n");
                }
            }
        }
        
        if(resposta.equals("")) {
            resposta = "Nenhum cliente encontrado";
        }
        
        return resposta;
    }
    
    public String clienteMaisVelho(){
        int maiorIdade = 0;
        String resposta = "";
        
        for(Cliente c: clientes){
            if(c.getIdade() > maiorIdade){
                maiorIdade = c.getIdade();
                resposta = c.getNome() + " - " +  Integer.toString(c.getIdade()) + "\n";
            } else if (c.getIdade() == maiorIdade) {
                resposta = resposta.concat(c.getNome() + " - " +  Integer.toString(c.getIdade()) + "\n");
            }
        }
        
        return resposta;
    }
        
    public String clienteMaisNovo(){
        int menorIdade = -1;
        String resposta = "";
        
        for(Cliente c: clientes){            
            if(c.getIdade() < menorIdade || menorIdade == -1){
                menorIdade = c.getIdade();
                resposta = c.getNome() + " - " +  Integer.toString(c.getIdade()) + "\n";
            } else if (c.getIdade() == menorIdade) {
                resposta = resposta.concat(c.getNome() + " - " +  Integer.toString(c.getIdade()) + "\n");
            }
        }
        
        return resposta;
    }    
        
    public int clienteMaisVelhos60(){        
        int quantidade = 0;
        for(Cliente c: clientes){            
            if(c.getIdade() > 60){
                quantidade++;
            }
        }
        
        return quantidade;
    }
            
    public int clienteMaisNovos18(){        
        int quantidade = 0;
        for(Cliente c: clientes){            
            if(c.getIdade() < 18){
                quantidade++;
            }
        }
        
        return quantidade;
    }
                
    public float clienteMediaIdades(){        
        int idadeTotal = 0;
        for(Cliente c: clientes){        
            idadeTotal += c.getIdade();
        }
        
        return (float) idadeTotal/clientes.size();
    }
}

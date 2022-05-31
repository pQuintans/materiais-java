/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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
    
}

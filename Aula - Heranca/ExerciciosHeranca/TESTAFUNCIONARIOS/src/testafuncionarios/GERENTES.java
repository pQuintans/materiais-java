/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author aluno
 */
public class GERENTES extends FUNCIONARIO {
    private String username;
    private String senha;

    public GERENTES(String nome, double salario, String username, String senha) {
        super(nome, salario);
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public double calculaBonificacao() {
        return (this.getSalario() * 0.5);
    }
    
    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Username: " + this.username + ", Senha: " + this.senha);
    }
   
}

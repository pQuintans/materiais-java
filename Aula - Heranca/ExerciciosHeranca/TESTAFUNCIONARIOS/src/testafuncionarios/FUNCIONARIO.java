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
public class FUNCIONARIO {
    private String nome;
    private double salario;

    public FUNCIONARIO(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaBonificacao() {
        return (this.salario * 0.10);
    }
    
    public void mostraDados() {
        System.out.println("Nome: " + this.nome + ", Salário: " + this.salario + ", Bonificação: " + this.calculaBonificacao());
    }
}

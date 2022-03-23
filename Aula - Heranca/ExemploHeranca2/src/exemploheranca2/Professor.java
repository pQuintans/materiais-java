/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca2;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario, float altura) {
        super(nome, idade);
        this.salario = salario;
        
        this.altura = altura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

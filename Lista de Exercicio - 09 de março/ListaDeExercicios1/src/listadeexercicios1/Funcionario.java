/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios1;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private Float salarioMen;

    public String getNome() {
        return nome;
    }
    
    public Funcionario() {
        nome = "";
        sobrenome = "";
        salarioMen = 0f;
    }
    
    public Funcionario(String nome, String sobrenome, Float salarioMen) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salarioMen < 0) {
            this.salarioMen = 0f;
        } else {
            this.salarioMen = salarioMen;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Float getSalarioMen() {
        return salarioMen;
    }

    public void setSalarioMen(Float salarioMen) {
        if(salarioMen < 0) {
            this.salarioMen = 0f;        
        } else {
            this.salarioMen = salarioMen;
        }
    }
    
    
}

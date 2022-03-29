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
public class TELEFONISTAS extends FUNCIONARIO {
    private String codigoEstacao;

    public TELEFONISTAS(String nome, double salario, String codigoEstacao) {
        super(nome, salario);
        this.codigoEstacao = codigoEstacao;
    }

    public String getCodigoEstacao() {
        return codigoEstacao;
    }

    public void setCodigoEstacao(String codigoEstacao) {
        this.codigoEstacao = codigoEstacao;
    }
    
    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Código da estação: " + this.codigoEstacao);
    }
    
    
}

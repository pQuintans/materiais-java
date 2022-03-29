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
public class SECRETARIAS extends FUNCIONARIO {
    private int numRamal;

    public SECRETARIAS(String nome, double salario, int numRamal) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    public int getNumRamal() {
        return numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }
    
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Numero do ramal: " + this.numRamal);
    }
    
}

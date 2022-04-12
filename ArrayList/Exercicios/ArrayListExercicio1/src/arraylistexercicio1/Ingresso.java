/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio1;

/**
 *
 * @author aluno
 */
public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }    
    
    public void imprimeValor() {
        System.out.println("Valor: " + this.valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

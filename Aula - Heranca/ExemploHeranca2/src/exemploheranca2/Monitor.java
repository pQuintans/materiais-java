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
public class Monitor extends Aluno {
    private double bolsa;

    public Monitor(String nome, int idade, int ra, double bolsa) {
        super(nome, idade, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
}

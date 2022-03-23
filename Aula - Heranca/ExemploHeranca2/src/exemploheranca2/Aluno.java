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
public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca4;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    private int ra;

    public Aluno(int ra, String nome, int idade) {
        super(nome, idade);
        this.ra = ra;
    }  
    
    @Override
    public void mostra() {
        super.mostra();
        System.out.println("RA: " + this.ra);
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}

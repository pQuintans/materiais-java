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
public class ExemploHeranca4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno(200126, "Flábio", 17);
        a1.mostra();
        
        Pessoa p1 = new Pessoa("Pedro", 17);
        p1.mostra();
    }
    
}

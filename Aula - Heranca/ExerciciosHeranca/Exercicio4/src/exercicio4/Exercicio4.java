/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico m1 = new Medico(true);
        ClinicoGeral cg1 = new ClinicoGeral(false, true);
        Cirurgiao c1 = new Cirurgiao(true);
        
        m1.tratarPaciente();
        cg1.receitar();
        c1.tratarPaciente();
        c1.fazerIncisao();
    }
    
}

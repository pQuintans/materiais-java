/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroAcademico p1 = new RegistroAcademico("Pedro", 2, 3);
        RegistroAcademico p2 = new RegistroAcademico("Fábio", 4, 3);
        RegistroAcademico p3 = new RegistroAcademico("Modesto", 5, 3);
        RegistroAcademico p4 = new RegistroAcademico("Enzo", 1, 3);
        
        System.out.println("Numweo de matrículas: " + RegistroAcademico.getNumeroMatricula());
    }
    
}

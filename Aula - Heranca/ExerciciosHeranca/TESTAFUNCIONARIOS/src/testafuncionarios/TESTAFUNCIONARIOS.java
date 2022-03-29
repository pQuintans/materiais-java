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
public class TESTAFUNCIONARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GERENTES g1 = new GERENTES("fabio", 200.53, "fBenedicto", "123senha");
        SECRETARIAS s1 = new SECRETARIAS("vincius", 100.53, 123);
        TELEFONISTAS t1 = new TELEFONISTAS("enzo", 40.53, "2");
        
        
        System.out.println("G1");
        g1.mostraDados();
        System.out.println("\nS1");
        s1.mostraDados();
        System.out.println("\nT1");
        t1.mostraDados();
    }
    
}

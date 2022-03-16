/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.methods;

/**
 *
 * @author aluno
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = new String("Java");
        String maiusculas = str1.toUpperCase();
        System.out.println(maiusculas);
        
        String minusculas = str1.toLowerCase();
        System.out.println(minusculas);
        
        char carac = str1.charAt(0);
        System.out.println(carac);
        
        boolean terminaCom = str1.endsWith("a");
        System.out.println(terminaCom);
        
        boolean comecaCom = str1.endsWith("x");
        System.out.println(comecaCom);
        
        boolean semCase = str1.equalsIgnoreCase("JAVA");
        System.out.println(semCase);
    }
    
}

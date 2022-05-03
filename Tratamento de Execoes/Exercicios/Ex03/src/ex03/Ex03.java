/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author aluno
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculoMatematico calculoMatematico = new CalculoMatematico();
        try {
            calculoMatematico.divisao(4, 0);
        } catch(ArithmeticException error) {
            System.out.println("Não é possível realizar uma divisão por 0");
        }
    }
    
}

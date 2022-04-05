/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoexemplo2;

/**
 *
 * @author aluno
 */
public class PolimorfismoExemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrilatero q1 = new Retangulo(2, 4);
        System.out.println(q1.area());
        
        Quadrilatero q2 = new Trapezio(3, 5, 10);        
        System.out.println(q2.area());
    }
    
}

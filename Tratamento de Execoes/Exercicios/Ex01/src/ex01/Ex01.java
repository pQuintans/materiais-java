/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author aluno
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object o = null;
        try {
            o.toString();
        } catch(NullPointerException error) {
            System.out.println("Você não pode transformar um objeto nulo em uma String");
        }
    }
    
}

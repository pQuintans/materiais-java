/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.polimorfismo;

/**
 *
 * @author aluno
 */
public class ExercícioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("rex", 0);
        animal1.sound();
        
        System.out.println("<>");
        
        Animal animal2 = new Cavalo("silver", 2);
        animal2.sound();
        
        System.out.println("<>");
        
        Animal animal3 = new Preguica("gigante", 5);
        animal3.sound();
    }
    
}

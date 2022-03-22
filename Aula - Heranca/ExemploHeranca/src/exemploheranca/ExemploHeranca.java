/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

/**
 *
 * @author aluno
 */
public class ExemploHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroTurbo c1 = new CarroTurbo("Nissan");
        CarroNormal c2 = new CarroNormal("Chevrolet");
        
        System.out.println("Carro Turbo - Marca: " + c1.getMarca());
        
        c1.liga();
        System.out.println("Ligado? " + c1.isLigado());
        c1.desliga();
        System.out.println("Ligado? " + c1.isLigado());
        c1.ligaTurbo();
        System.out.println("Turbo? " + c1.isTurbo());
        
        System.out.println("\nCarro Normal - Marca: " + c2.getMarca());
        
        c2.liga();
        System.out.println("Ligado? " + c2.isLigado());
        c2.desliga();
        System.out.println("Ligado? " + c2.isLigado());
        // c2.ligaTurbo();
        // System.out.println("Turbo? " + c1.isTurbo());
    }
    
}

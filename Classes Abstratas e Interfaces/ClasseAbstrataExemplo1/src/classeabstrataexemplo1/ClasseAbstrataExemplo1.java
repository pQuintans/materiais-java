/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrataexemplo1;

/**
 *
 * @author aluno
 */
public class ClasseAbstrataExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Forma f = new Forma();
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        
        Forma f = new Quadrado();
        
        c.setRaio(2);
        c.calcularArea();
        System.out.println(c.getArea());
        
        q.setLado(3);
        q.calcularArea();
        System.out.println(q.getArea());
    }
    
}

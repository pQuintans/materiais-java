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
public class Trapezio extends Quadrilatero {
    private double base2;

    public Trapezio(double base, double altura, double base2) {
        super(base, altura);
        this.base2 = base2;
    }
    
    
    
   @Override
   public double area() {
     return (this.getBase() + base2)*this.getAltura()/2;  
   }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }
    
}

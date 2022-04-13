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
public class Quadrado extends Forma {
    private double lado;
    
    @Override
    public void calcularArea(){
        setArea(lado * lado);  
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

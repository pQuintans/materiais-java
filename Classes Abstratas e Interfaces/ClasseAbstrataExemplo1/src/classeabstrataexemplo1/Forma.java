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

//Classe abstrata não permite instância (new)
public abstract class Forma {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    //Método abstrato não tem implemenação
    //Método abstrato obriga sobescria nas classes filas
    //Método abstrato tora obrigatoriamente classe abstrata
    public abstract void calcularArea();
    
}

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
public class Quadrilatero {
    private double base;
    private double altura;

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
        
    public double area(){
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

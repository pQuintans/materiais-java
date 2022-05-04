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
public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return("Cordenada X: " + x + "\tCordenada Y: " + y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
}

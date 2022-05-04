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
public class Ponto3D extends Ponto2D {
    private double z;
    
    public String toString(){
        return(super.toString() + "\tCordenada Z: " + z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Ponto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
}

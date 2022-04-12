/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio3;

/**
 *
 * @author aluno
 */
public class Quadrado extends FormaBiDimensional{
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterArea(){
        return lado * lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}

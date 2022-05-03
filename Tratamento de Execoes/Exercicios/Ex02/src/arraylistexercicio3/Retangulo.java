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
public class Retangulo extends FormaBiDimensional implements AreaCalculavel {
    private float base;
    private float altura;

    
    public Retangulo(float base, float altura){
        if(base <= 0 || altura <=0){
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0(zero)");
        } else if(base == altura){
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
        }
    }
    
    @Override
    public double calcularArea(){
        return 1;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

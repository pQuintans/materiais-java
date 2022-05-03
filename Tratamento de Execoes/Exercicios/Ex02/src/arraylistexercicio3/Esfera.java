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
public class Esfera extends FormaTriDimensional{
    private float raio;

    public Esfera(float raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return 4 * 3.14 * Math.pow(raio, 2);
    }
    
    @Override
    public double obterVolume(){
        return (4 * 3.14 * Math.pow(raio, 3))/3;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}

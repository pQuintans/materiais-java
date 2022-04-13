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
public class Circulo extends Forma {
    private float raio;
    
    @Override
    public void calcularArea(){
        setArea(3.14 * raio * raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}

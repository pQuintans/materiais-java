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
public class Cubo extends FormaTriDimensional {
    private float aresta;

    public Cubo(float aresta) {
        this.aresta = aresta;
    }

    public float getAresta() {
        return aresta;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }
    
    @Override
    public double obterArea(){
        return 6 * aresta * aresta;
    }
    
    @Override
    public double obterVolume(){
        return Math.pow(aresta, 3);
    }
}

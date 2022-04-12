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
public class Tetraedro extends FormaTriDimensional{
    private float aresta;

    public Tetraedro(float aresta) {
        this.aresta = aresta;
    }
    
    @Override
    public double obterArea(){
        return Math.pow(aresta,2) * Math.sqrt(3);
    }
    
    @Override
    public double obterVolume(){
        return Math.pow(aresta, 3) *  Math.sqrt(2) / 12;
    }

    public float getAresta() {
        return aresta;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }
}

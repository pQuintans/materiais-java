/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio3;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ArrayListExercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma circulo = new Circulo(3);
        Forma quadrado = new Quadrado(3);
        Forma triangulo = new Triangulo(3, 5);
        Forma esfera = new Esfera(4);
        Forma cubo = new Cubo(5);
        Forma tetraedro = new Tetraedro(3);
        
        ArrayList<Forma> formas = new ArrayList();
        formas.add(circulo);
        formas.add(quadrado);
        formas.add(triangulo);
        formas.add(esfera);
        formas.add(cubo);
        formas.add(tetraedro);
        
        for(Forma f: formas){
            System.out.println("Area: " + f.obterArea());
            
            if(f instanceof FormaTriDimensional){
                System.out.println("Volume: " + ((FormaTriDimensional) f).obterVolume()); 
            }     
            
            System.out.println("");
        }
    }
    
}

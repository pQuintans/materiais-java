/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.polimorfismo;

/**
 *
 * @author aluno
 */
public class Cavalo extends Animal {

    public Cavalo(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void sound(){
        System.out.println("Som de cavalo!");
    }
    
    public void run(){
        System.out.println("Subindo em árvores!");
    }
}

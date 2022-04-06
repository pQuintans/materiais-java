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
public class Preguica extends Animal{
    public Preguica(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void sound(){
        System.out.println("Som de preguiça!");
    }
    
    @Override
    public void move(){
        System.out.println("Subindo em árvores!");
    }
}

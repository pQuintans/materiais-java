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
public class Animal {
    private String name;
    private int age;
    
    public void sound(){
        System.out.println("Som!");
    }
    
    public void move(){
        System.out.println("Correndo!");
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

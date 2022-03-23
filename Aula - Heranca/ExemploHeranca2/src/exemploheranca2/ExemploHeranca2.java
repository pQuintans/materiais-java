/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca2;

/**
 *
 * @author aluno
 */
public class ExemploHeranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Flávio", 45);
        System.out.println("P1:\nNome P1: " + p1.getNome() + ", Idade: " + p1.getIdade());    
        
        Aluno a1 = new Aluno("Flabio", 200183, 12);   
        System.out.println("\nA1:\nNome: " + a1.getNome() + ", Idade: " + a1.getIdade() + ", RA: " + a1.getRa());
        
        Professor prof1 = new Professor("Matiolli", 92, 20000, 1.58f);        
        System.out.println("\nPROF1:\nNome: " + prof1.getNome() + ", Idade: " + prof1.getIdade() + ", Salário: " + prof1.getSalario() + ", Altura: " + prof1.getAltura());
        
        
        Monitor m1 = new Monitor("Jesus", 2022, 200154, 150);                
        System.out.println("\nM1:\nNome: " + m1.getNome() + ", Idade: " + m1.getIdade() + ", RA: " + m1.getRa() + ", Bolsa: " + m1.getBolsa());
    }
    
}

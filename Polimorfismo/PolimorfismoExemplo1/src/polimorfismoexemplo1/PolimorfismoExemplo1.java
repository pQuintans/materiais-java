/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoexemplo1;

/**
 *
 * @author aluno
 */
public class PolimorfismoExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new Livro();
        p.mostra(); // returns "Isto é um livro"
        
        Produto p2 = new Revista();
        p2.mostra(); // returns "Isto é uma revista"
        
        Livro l = new Livro();
        Produto p3 = (Produto) l;
        p3.mostra(); // returns "Isto é um livro"
        //p3.setEditora(); //ERRO - EDITORA É ESPECIFICO DE LIVRO
        
        Livro l2 = new Livro();
        l2.mostra();
        l2.setEditora("Abril");
        
        System.out.println("");
        
        if (p2 instanceof Revista) {
            System.out.println("P2 é instancia de Revista");
        } else {
            System.out.println("P2 não é instancia de Revista");
        } 
        
        if (p2 instanceof Produto) {
            System.out.println("P2 é instancia de Produto");
        } else {
            System.out.println("P2 não é instancia de Produto");
        } 
        
        if (p2 instanceof Livro) {
            System.out.println("P2 é instancia de Livro");
        } else {
            System.out.println("P2 não é instancia de Livro");
        } 
    }
    
}

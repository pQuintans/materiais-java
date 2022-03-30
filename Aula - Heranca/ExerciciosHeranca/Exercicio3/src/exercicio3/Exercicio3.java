/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Novo n1 = new Novo(1, "Rua legal", 100.5, 15);
        Usado u1 = new Usado(2, "Rua bacana", 100.5, 15);
        System.out.println("Código: " + n1.getCodigo() + ", Rua: " + n1.getEndereco() + ", Preco final: " + n1.getPreco());
        System.out.println("Código: " + u1.getCodigo() + ", Rua: " + u1.getEndereco() + ", Preco final: " + u1.getPreco());
        n1.setPreco(200);
        System.out.println("n1 preco: " + n1.getPreco());
    }
    
}

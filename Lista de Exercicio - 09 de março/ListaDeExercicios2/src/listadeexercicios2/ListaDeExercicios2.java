/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios2;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item0 = new Item(0, "bolo quente", 2, 13.90f);
        Item item1 = new Item(1, "bolo frio", 8, 13.0f);
        
        System.out.println("Código: " + item0.getCodigo());
        System.out.println("Descrição: " + item0.getDescricao());
        System.out.println("Qunatidade: " + item0.getQuantidade());
        System.out.printf("Preço: %.2f \n", item0.getPreco());
        System.out.printf("Total: %.2f \n", item0.getTotal());
        
        System.out.println("Código: " + item1.getCodigo());
        System.out.println("Descrição: " + item1.getDescricao());
        System.out.println("Qunatidade: " + item1.getQuantidade());
        System.out.printf("Preço: %.2f \n", item1.getPreco());
        System.out.printf("Total: %.2f \n", item1.getTotal());
        
        Item item2 = new Item(3, "bolo morno", -2, 14.0f);
        
        System.out.println("Quantidade (" + item2.getDescricao() + "): " + item2.getQuantidade());
        
        item2.setPreco(-15f);
        
        System.out.printf("Preco (" + item2.getDescricao() + "): %.2f\n", item2.getPreco());
    }
    
}

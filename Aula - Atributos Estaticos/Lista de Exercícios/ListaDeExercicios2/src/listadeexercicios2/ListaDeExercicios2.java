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
        int maiorNumEntre2 = Comparar.maior(1, 2);
        int menorNumEntre2 = Comparar.menor(1, 2);
        System.out.println("\nMaior número entre 1 e 2: " + maiorNumEntre2);
        System.out.println("Menor número entre 1 e 2: " + menorNumEntre2);
        
        int maiorNumEntre3 = Comparar.maior(1, 5, 3);
        int menorNumEntre3 = Comparar.menor(1, 5, 3);
        System.out.println("\nMaior número entre 1, 5 e 3: " + maiorNumEntre3);
        System.out.println("Menor número entre 1, 5 e 3: " + menorNumEntre3);
        
        int maiorNumEntre4 = Comparar.maior(1, 2, 7, 12);
        int menorNumEntre4 = Comparar.menor(1, 2, 7, 12);
        System.out.println("\nMaior número entre 1, 2, 7 e 12: " + maiorNumEntre4);
        System.out.println("Menor número entre 1, 2, 7 e 12: " + menorNumEntre4);
        
        int maiorNumEntre5 = Comparar.maior(21, 5, 3, 7, 9);
        int menorNumEntre5 = Comparar.menor(21, 5, 3, 7, 9);
        System.out.println("\nMaior número entre 21, 5, 3, 7 e 9: " + maiorNumEntre5);
        System.out.println("Menor número entre 21, 5, 3, 7 e 9: " + menorNumEntre5);
    }
    
}

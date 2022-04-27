/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotrycatch;

/**
 *
 * @author aluno
 */
public class ExemploTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void aumentarLetra(){ 
        String teste = "c";
        try {            
            System.out.println(teste.toUpperCase());
            System.out.println(teste.charAt(3));
        } catch(NullPointerException e) {
            System.out.println("String vazia");
        } catch(StringIndexOutOfBoundsException e1) {
            System.out.println("Índice fora dos limites");
        } catch(Exception error) {
            System.out.println("Erro: " + error.getMessage());
        } finally {
            System.out.println("Fim Try Catch");
        }
    }
    
    public static void main(String[] args) {
        aumentarLetra();
        System.out.println("Fim");
    }
    
}

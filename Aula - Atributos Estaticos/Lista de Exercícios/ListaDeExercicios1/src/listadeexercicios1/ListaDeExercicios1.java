/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios1;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("0 graus Celsius correspondem à " + ConversaoDeTemperatura.CToF(0) + " Fahrenheit");
        System.out.println("100 graus Celsius correspondem à " + ConversaoDeTemperatura.CToF(100) + " Fahrenheit");
        System.out.println("50 graus Fahrenheit correspondem à " + ConversaoDeTemperatura.FToC(50) + " Celsius");
    }
    
}

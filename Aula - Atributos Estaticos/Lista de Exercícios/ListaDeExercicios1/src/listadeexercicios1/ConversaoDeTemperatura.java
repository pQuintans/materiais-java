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
public class ConversaoDeTemperatura {
    public static double CToF(float c){
        return c*1.8+32;
    }
    
    public static double FToC(float f){
        return (f-32)/1.8;
    }
}

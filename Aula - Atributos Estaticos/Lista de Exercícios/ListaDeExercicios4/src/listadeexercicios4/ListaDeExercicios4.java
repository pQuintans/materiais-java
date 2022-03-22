/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios4;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimuladorCaixaBanco caixa1 = new SimuladorCaixaBanco(1);
        SimuladorCaixaBanco caixa2 = new SimuladorCaixaBanco(2);
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa1.proximoAtendimento();
    }
    
}

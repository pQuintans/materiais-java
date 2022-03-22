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
public class SimuladorCaixaBanco {
    private static int numeroDoCliente = 0;
    private int numeroDoCaixa;

    SimuladorCaixaBanco(int n)
    {
        numeroDoCaixa = n;
        System.out.println("Caixa " + numeroDoCaixa + " iniciou operação.");
    }

    public void proximoAtendimento()
    {
        numeroDoCliente = numeroDoCliente + 1;
        System.out.print("Cliente com a senha no " + numeroDoCliente + ", favor ");
        System.out.println("dirigir-s ao caixa no " + numeroDoCaixa + ".");
    }
}

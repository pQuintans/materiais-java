/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author aluno
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria cc1 = new ContaCorrente(200);
        ContaBancaria ci1 = new ContaInvestimento(100);

        System.out.println("Saldo conta corrente: " + cc1.getSaldo());
        System.out.println("Saldo conta corrente: " + ci1.calcularSaldo());
        System.out.println("");

        cc1.depositar(200);

        try {
            ci1.sacar(110);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        }

        System.out.println("Saldo conta corrente: " + cc1.calcularSaldo());
        System.out.println("Saldo conta corrente: " + ci1.calcularSaldo());
        System.out.println("");

        try {
            ci1.transferir(50, cc1);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        }

        System.out.println("Saldo conta corrente: " + cc1.calcularSaldo());
        System.out.println("Saldo conta corrente: " + ci1.calcularSaldo());
        System.out.println("");

        try {
            cc1.sacar(-2);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        }

        System.out.println("Saldo conta corrente: " + cc1.calcularSaldo());
        System.out.println("Saldo conta corrente: " + ci1.calcularSaldo());
        System.out.println("");
    }
    
}

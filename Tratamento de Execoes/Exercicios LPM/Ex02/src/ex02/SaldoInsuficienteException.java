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
public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(double saldo) {
        System.out.println("Você só tem " + saldo + " de saldo disponivel.");
    }
}

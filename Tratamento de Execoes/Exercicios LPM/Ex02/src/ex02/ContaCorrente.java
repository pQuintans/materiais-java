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
public class ContaCorrente extends ContaBancaria {    
    @Override
    public double calcularSaldo() {
        return 0.9 * saldo;
    }
}

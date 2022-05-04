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
public class ContaInvestimento extends ContaBancaria {
    @Override
    public double calcularSaldo() {
        return 1.05 * saldo;
    }
}

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
public abstract class ContaBancaria {
    protected double saldo;
    
    public void depositar(double deposito){
        if(deposito <= 0) {
            throw new ValorInvalidoException(deposito);
        }
        
        saldo += deposito;
    }
    
    public void sacar(double saque){
        if(saque <= 0) {
            throw new ValorInvalidoException(saque);
        }        
        
        if(saldo < saque) {
            throw new SaldoInsuficienteException(saldo);
        }
        
        saldo -= saque;
    }
    
    public void transferir(double valor, ContaBancaria destinatario) {
        if(valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        
        if(saldo < valor) {
            throw new SaldoInsuficienteException(saldo);
        }
        
        this.sacar(valor);
        destinatario.depositar(valor);
    }
    
    public abstract double calcularSaldo();
}

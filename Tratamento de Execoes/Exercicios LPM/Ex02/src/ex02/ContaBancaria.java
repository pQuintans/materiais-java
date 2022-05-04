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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
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
        
        if(this.calcularSaldo() < saque) {
            throw new SaldoInsuficienteException(this.calcularSaldo());
        }
        
        saldo -= saque;
    }
    
    public void transferir(double valor, ContaBancaria destinatario) {
        if(valor <= 0) {
            throw new ValorInvalidoException(valor);
        }
        
        if(this.calcularSaldo() < valor) {
            throw new SaldoInsuficienteException(this.calcularSaldo());
        }
        
        this.sacar(valor);
        destinatario.depositar(valor);
    }
    
    public abstract double calcularSaldo();
}

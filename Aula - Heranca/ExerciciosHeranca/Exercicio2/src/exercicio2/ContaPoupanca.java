/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
     public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(double taxaRendimento){
        this.setSaldo(this.getSaldo() + this.getSaldo()*(taxaRendimento/100));
    }

}

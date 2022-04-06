/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo1;

/**
 *
 * @author aluno
 */
public class ContaCorrente {
    private int saldo;
    
    public void ContaCorrente() {
        saldo = 0;
    }    
    
    public void deposita(int quantidade) {
        this.saldo += quantidade;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

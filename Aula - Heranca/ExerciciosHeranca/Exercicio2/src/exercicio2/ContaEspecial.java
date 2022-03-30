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
public class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(String cliente, int numConta, double saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double saque) {
        if (saque >= (this.getSaldo() + limite)) {
            if (saque - this.getSaldo() > limite) {
                System.out.println("Saque impossível pois ultrapassa seu limite");
            } else {
                this.setSaldo(this.getSaldo() - saque);
            }
        } else {
            super.sacar(saque);
        }

    }
}

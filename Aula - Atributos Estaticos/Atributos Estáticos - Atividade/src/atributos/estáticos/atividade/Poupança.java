/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos.estáticos.atividade;

/**
 *
 * @author aluno
 */
public class Poupança {
    private static float taxaJurosAnual;
    private float saldo;
    
    public Poupança (float saldo) {
        this.saldo = saldo;
    }

    public static float getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public float getSaldo() {
        return saldo;
    }
        
    public void calcularJurosMensais() {
        this.saldo += this.saldo * (taxaJurosAnual/12);
    }
    
    public static void modificaTaxaJuros(float taxa) {
        taxaJurosAnual = taxa;
    }
}

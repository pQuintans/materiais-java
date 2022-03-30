/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author aluno
 */
public class Usado extends Imovel {
    private double desconto;

    public Usado(int codigo, String endereco, double preco, double desconto) {
        super(codigo, endereco, preco - desconto);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    } 
    
    public void setPreco(double preco) {
        super.setPreco(preco - this.desconto);
    }
}

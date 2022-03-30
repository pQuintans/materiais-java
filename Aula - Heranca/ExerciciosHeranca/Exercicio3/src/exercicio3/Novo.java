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
public class Novo extends Imovel {
    private double precoAdicional;
    
    public Novo(int codigo, String endereco, double preco, double precoAdicional) {
        super(codigo, endereco, preco + precoAdicional);
        this.precoAdicional = precoAdicional;        
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
     
    @Override
    public void setPreco(double preco) {
        super.setPreco(preco + this.precoAdicional);
    }
}

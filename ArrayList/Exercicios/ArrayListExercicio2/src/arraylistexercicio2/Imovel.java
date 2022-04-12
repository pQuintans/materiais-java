/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio2;

/**
 *
 * @author aluno
 */
public class Imovel {
    private String endereco;
    private float preco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Imovel(String endereco, float preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
    
}

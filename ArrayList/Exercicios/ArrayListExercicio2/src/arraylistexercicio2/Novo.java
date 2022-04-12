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
public class Novo extends Imovel {
    private float precoAdicional;

    public Novo(String endereco, float preco, float precoAdicional) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public float getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(float precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    
    
    
}

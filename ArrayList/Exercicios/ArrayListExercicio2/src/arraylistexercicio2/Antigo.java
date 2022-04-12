
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
public class Antigo extends Imovel {
    private float precoDesonto;

    public Antigo(String endereco, float preco, float precoDesonto) {
        super(endereco, preco);
        this.precoDesonto = precoDesonto;
    }

    public float getPrecoDesonto() {
        return precoDesonto;
    }

    public void setPrecoDesonto(float precoDesonto) {
        this.precoDesonto = precoDesonto;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios2;

/**
 *
 * @author aluno
 */
public class Item {
    
    private int codigo;
    private String descricao;
    private int quantidade;
    private float preco;
    
    public Item(int codigo, String descricao, int quantidade, float preco){
        this.codigo = codigo;
        this.descricao = descricao;
        
        if(quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        
        if(preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade; 
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0){
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
    
    public float getTotal(){
        return (preco * quantidade);
    }
}

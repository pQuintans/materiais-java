/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Jogo {
    private int codigo;
    private static int numeroJogos;
    private String nome;
    private int anoLancamento;
    private String genero;
    private float preco;
    private String descricao;
    //precisa adicionar a descrição

    public Jogo(String nome, int anoLancamento, String genero, float preco, String descricao) {
        numeroJogos++;
        this.codigo = numeroJogos;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    public static int getNumeroJogos(){
        return numeroJogos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.codigo = descricao;
    }
}

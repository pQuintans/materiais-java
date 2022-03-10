/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int idade;
    private int diaNas;
    private int mesNas;
    private int anoNas;
    private String nome;
    
    public Pessoa(int idade, int diaNas, int mesNas, int anoNas, String nome) {
        this.idade = idade;
        this.diaNas = diaNas;
        validaDia();
        this.mesNas = mesNas;
        validaMes();
        this.anoNas = anoNas;
        validaAno();
        this.nome = nome;
    }
    
    public Pessoa(int diaNas, int mesNas, int anoNas, String nome, int diaAt, int mesAt, int anoAt) {
        this.diaNas = diaNas;
        validaDia();
        this.mesNas = mesNas;
        validaMes();
        this.anoNas = anoNas;
        validaAno();
        this.nome = nome;
        
        calculaIdade(diaAt, mesAt, anoAt);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDiaNas() {
        return diaNas;
    }

    public void setDiaNas(int diaNas) {
        this.diaNas = diaNas;
        validaDia();
    }

    public int getMesNas() {
        return mesNas;
    }

    public void setMesNas(int mesNas) {
        this.mesNas = mesNas;
        validaMes();
    }

    public int getAnoNas() {
        return anoNas;
    }

    public void setAnoNas(int anoNas) {
        this.anoNas = anoNas;
        validaAno();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public final void calculaIdade(int dia, int mes, int ano) {
        int idade = ano - anoNas;
        
        if(mes > mesNas) {
            idade++;
        } else if(mes == mesNas) {
            if(dia >= diaNas){
                idade++;
            }
        }
        
        this.idade = idade;
    }
    
    public final void validaDia() {
        if((diaNas > 31 || diaNas < 1)) {
            System.out.println("Dia Inválido");
            diaNas = 1;
        }
    }
    
    public final void validaMes() {
        if((mesNas > 12 || mesNas < 1)) {
            System.out.println("Mes Inválido");
            mesNas = 1;
        }
    }
    
    public final void validaAno() {
        if(anoNas < 1000) {
            System.out.println("Ano Inválido");
            anoNas = 1999;
        }
    }
    
    public int informaIdade() {
        return idade;
    }
    
    public String informaNome() {
        return nome;
    }
}

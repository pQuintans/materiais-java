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
public class RegistroAcademico {
    private String nome;
    private static int numeroMatricula = 0;
    private int codigoCurso;
    private int percentualCobranca;
    
    public RegistroAcademico(String nome, int codigoCurso, int percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        
        numeroMatricula += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(int percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
}

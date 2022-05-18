/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaController {
    private ArrayList<Atleta> atletas;

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }
    
    public AtletaController() {
        atletas = new ArrayList();
    }
    
    public String cadastrarAtleta(String codigo, String nome, float altura, int idade, float peso){
        Atleta atleta = new Atleta(codigo, nome, altura, idade, peso);
        atletas.add(atleta);
        
        return "Atleta cadastrado com sucesso";
    }
    
    public float calcularMediaPeso(){
        float pesoTotal = 0;
        for(Atleta a: atletas){
            pesoTotal += a.getPeso();
        }
        
        return pesoTotal / atletas.size();
    }
    
    public String getAlunoMaisAlto(){
        float maiorAltura = 0;
        String nomeAlunoMaisAlto = "";
        for(Atleta a: atletas){
            if(a.getAltura() > maiorAltura){
                maiorAltura = a.getAltura();
                nomeAlunoMaisAlto = a.getNome();
            }
        }
        
        return nomeAlunoMaisAlto;
    }
    
    private int getQtdAlunosDeMaior(){
        int alunosDeMaior = 0;
        for(Atleta a: atletas){
            if(a.getIdade() >= 18){
                alunosDeMaior++;
            }
        }
        
        return alunosDeMaior;
    }
    
    private int getQtdAlunosDeMenor(){
        int alunosDeMenor = 0;
        for(Atleta a: atletas){
            if(a.getIdade() < 18){
                alunosDeMenor++;
            }
        }
        
        return alunosDeMenor;
    }
    
    public String getInfoIdades() {
        return getQtdAlunosDeMaior() + " alunos de maior e " + getQtdAlunosDeMenor() + " alunos de menor";
    }
}

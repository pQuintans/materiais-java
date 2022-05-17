/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {
    private ArrayList<Aluno> lista;
    
    public AlunoController(){
        lista = new ArrayList();
    }
    
    public void cadastrar(String nome, int idade) {
        Aluno al = new Aluno(nome, idade);
        lista.add(al);
    }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }
    
    public void deleteAluno(String nome){
        for(Aluno a: lista){
            if(a.getNome().equals(nome)){
                lista.remove(a);
                break;
            }
        }
    }
}

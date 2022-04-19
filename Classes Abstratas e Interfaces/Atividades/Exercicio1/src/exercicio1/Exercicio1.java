/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado a1 = new Assalariado("Fábio", "Benedicto", "123123", 200);
        Empregado a2 = new Assalariado("Pedro", "Quintans", "123123", 400);
        Empregado c1 = new Comissionado("Enzo", "Arilla", "123123", 3, 400);
        Empregado c2 = new Comissionado("Vinicius", "Laureano", "123123", 5, 700);
        Empregado h1 = new Horista("Karen", "Kuga", "123123", 500, 5);
        Empregado h2 = new Horista("Pedro", "Marci", "123123", 1000, 2);
        
        ArrayList<Empregado> lista = new ArrayList();
        
        lista.add(a1);
        lista.add(a2);
        lista.add(c1);
        lista.add(c2);
        lista.add(h1);
        lista.add(h2);
        
        for(Empregado i: lista) {
            System.out.println("Nome: " + i.getNome() + " | Vendas: " + i.vencimento());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio1;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ArrayListExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingresso c1 = new Comum(5);
        Ingresso c2 = new Comum(8);
        Ingresso c3 = new Comum(6);
        Ingresso v1 = new VIP(7, 6);
        Ingresso v2 = new VIP(8, 3);
        
        ArrayList<Ingresso> ingressos = new ArrayList();
        ingressos.add(c1);
        ingressos.add(c2);
        ingressos.add(c3);
        ingressos.add(v1);
        ingressos.add(v2);
        
        int faturamento = 0;
        
        for(Ingresso i: ingressos) {
            if(i instanceof VIP) {
                faturamento += ((VIP) i).getValorAdicional();
            }
            
            faturamento += i.getValor();
        }
        
        System.out.println("Valor faturamento: " + faturamento);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class ArrayListExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Manoel");
        
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);
        
        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);
        
        //Lista apenas de objetos
        ArrayList contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);
        
        //quantidade de elementos no arrayList
        System.out.println("contas.size() => returns " + contas.size());
        
        contas.remove(1); 
        
        //fazer cast para tornar de object para o tipo castado
        ContaCorrente teste = (ContaCorrente) contas.get(0);
        
        ArrayList<ContaCorrente> contaLista = new ArrayList<ContaCorrente>();
        lista.add(c1);
        lista.add(c2);        
    }
    
}

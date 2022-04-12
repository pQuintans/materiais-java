/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio2;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ArrayListExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imovel a1 = new Antigo ("0", 1000, 500); 
        Imovel n1 = new Novo("1", 1000, 500); 
        Imovel a2 = new Antigo ("2", 2000, 500); 
        Imovel n2 = new Novo("3", 2000, 500); 
        
        ArrayList<Imovel> imoveis = new ArrayList(); 
        
        imoveis.add(a1);
        imoveis.add(n1);
        imoveis.add(a2);
        imoveis.add(n2);
        
        for(Imovel i: imoveis){
            if(i instanceof Novo)
                System.out.println("Endereço: " + i.getEndereco() + " \t Preço: " + (i.getPreco() + ((Novo) i).getPrecoAdicional()));
        }
    }
    
}

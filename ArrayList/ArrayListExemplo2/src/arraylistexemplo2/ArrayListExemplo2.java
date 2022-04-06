/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo2;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ArrayListExemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro liv1 = new Livro();
        liv1.setCodigo(12300);
        liv1.setNome("Diario de um banana");
        liv1.setEditora("bananalien");
        
        Revista r1 = new Revista();
        r1.setCodigo(12);
        r1.setNome("SuperInteressante");
        r1.setMes("Março");
        r1.setAno(2021);
        
        ArrayList<Produto> lista = new ArrayList();
        lista.add(r1);
        lista.add(liv1);
        
        for (Produto p: lista)
        {
            p.mostra();
            if (p instanceof Revista)
            {
               Revista r = (Revista) p;
                System.out.println(r.getMes() + " " + r.getAno());
            }
            else if (p instanceof Livro)
            {
                Livro l = (Livro) p;
                System.out.println(l.getEditora());
            }
        }
        
    }
    
}
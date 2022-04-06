/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo2;

/**
 *
 * @author aluno
 */
public class Livro extends Produto {
    private String editora;
   
    public void mostra() {
        System.out.println("Isto é um livro");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
}

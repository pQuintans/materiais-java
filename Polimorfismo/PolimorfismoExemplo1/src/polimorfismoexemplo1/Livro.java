/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoexemplo1;

/**
 *
 * @author aluno
 */
public class Livro extends Produto {
    private String editora;
    
    @Override
    public void mostra(){
        System.out.println("Isto é um Livro");
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
    
}

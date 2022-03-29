/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca3;

/**
 *
 * @author aluno
 */
public class Orelhao extends Telefone{
    
    @Override
    public String telefonar(){
        return super.telefonar() + " de um orelhão";
    }
}

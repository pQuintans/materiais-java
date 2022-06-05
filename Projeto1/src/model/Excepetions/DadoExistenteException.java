/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Excepetions;

/**
 *
 * @author aluno
 */
public class DadoExistenteException extends RuntimeException{
    public DadoExistenteException() {
        super("Dado já cadastrado");
    }
    
    public DadoExistenteException(String mensagem) {
        super(mensagem);
    }
}

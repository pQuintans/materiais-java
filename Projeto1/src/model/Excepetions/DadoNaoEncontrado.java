/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Excepetions;

/**
 *
 * @author FABIO
 */
public class DadoNaoEncontrado extends RuntimeException {
    public DadoNaoEncontrado() {
        super("Dado não encontrado");
    }
    
    public DadoNaoEncontrado(String mensagem) {
        super(mensagem);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class CampoVazioException extends RuntimeException{
    @Override
    public String getMessage() {
        return("Os campos não podem ser vazios");
    }
}

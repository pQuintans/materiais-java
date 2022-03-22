/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

/**
 *
 * @author aluno
 */
public class CarroNormal {
    private boolean ligado;
    private String marca;
    
    public CarroNormal(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getMarca() {
        return marca;
    }
    
    public void liga(){
        this.ligado = true;
    }
    
    public void desliga(){
        this.ligado = false;
    }
}

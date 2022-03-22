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
public class CarroTurbo extends CarroNormal {
    private boolean turbo;
    
    public CarroTurbo(String marca){
        super(marca);
    }

    public boolean isTurbo() {
        return turbo;
    }
    
    public void ligaTurbo(){
        this.turbo = true;
    }
    public void desligaTurbo(){
        this.turbo = false;
    }
}

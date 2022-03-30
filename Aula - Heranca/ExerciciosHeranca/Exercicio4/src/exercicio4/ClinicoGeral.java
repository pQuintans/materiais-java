/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno
 */
public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }
    
    public void receitar() {
        System.out.println("Clinico geral receitando");
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
    
    
}

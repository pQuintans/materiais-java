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
public class Medico {
    private boolean trabalhaNoHospital;

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    
    public void tratarPaciente() {
        System.out.println("Tratando paciente");
    }

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    
    
}

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
public class Cirurgiao extends Medico{
    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }
    
    public void tratarPaciente() {
        System.out.print("Cirurgiao ");
        super.tratarPaciente();
    }
    
    public void fazerIncisao() {
        System.out.println("Cirurgião fazendo incisão");
    }
}

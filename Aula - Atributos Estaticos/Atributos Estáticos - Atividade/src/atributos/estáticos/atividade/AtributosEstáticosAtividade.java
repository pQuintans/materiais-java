/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos.estáticos.atividade;

/**
 *
 * @author aluno
 */
public class AtributosEstáticosAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poupança poupança1 = new Poupança(2000);
        Poupança poupança2 = new Poupança(3000);
        Poupança.modificaTaxaJuros(0.03f);
        poupança1.calcularJurosMensais();
        poupança2.calcularJurosMensais();
        
        System.out.println("Saldo mês 1 - poupança1: " + poupança1.getSaldo());
        System.out.println("Saldo mês 1 - poupança2: " + poupança2.getSaldo());
        
        Poupança.modificaTaxaJuros(0.04f);
        poupança1.calcularJurosMensais();
        poupança2.calcularJurosMensais();
        
        System.out.println("Saldo mês 2 - poupança1: " + poupança1.getSaldo());
        System.out.println("Saldo mês 2 - poupança2: " + poupança2.getSaldo());
        
    } 
    
}

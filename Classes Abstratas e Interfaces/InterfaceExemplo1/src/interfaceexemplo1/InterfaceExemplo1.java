/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexemplo1;

/**
 *
 * @author aluno
 */
public class InterfaceExemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovel a1 = new Carro();
        Automovel a2 = new Caminhonete();
        
        a1.acelerar();
        a2.acelerar();
        
        ((Veiculo) a1).ligar();
    }
    
}

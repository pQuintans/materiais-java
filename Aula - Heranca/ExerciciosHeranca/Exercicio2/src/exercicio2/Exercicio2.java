/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContaBancaria conta1 = new ContaBancaria("Fábio", 1, 1000);
       ContaPoupanca conta2 = new ContaPoupanca("Fábio", 2, 1000, 2);
       ContaEspecial conta3 = new ContaEspecial("Fábio", 3, 1000, 100);
       
       conta1.depositar(100);
       conta2.depositar(100);
       conta3.depositar(100);
       conta1.sacar(50);
       conta2.sacar(50);
       conta3.sacar(50);
       
        System.out.println("Nome: " + conta1.getCliente() + " Número da conta: " + conta1.getNumConta() + " Saldo: " + conta1.getSaldo());
        System.out.println("Nome: " + conta2.getCliente() + " Número da conta: " + conta2.getNumConta() + " Saldo: " + conta2.getSaldo() + " Rendimento: " + conta2.getDiaRendimento());
        System.out.println("Nome: " + conta3.getCliente() + " Número da conta: " + conta3.getNumConta() + " Saldo: " + conta3.getSaldo() + "Limite: " + conta3.getLimite());
        
        System.out.println("\n");
        
        conta2.calcularNovoSaldo(2);
        conta3.sacar(100);
        
        System.out.println("Nome: " + conta1.getCliente() + " Número da conta: " + conta1.getNumConta() + " Saldo: " + conta1.getSaldo());
        System.out.println("Nome: " + conta2.getCliente() + " Número da conta: " + conta2.getNumConta() + " Saldo: " + conta2.getSaldo() + " Rendimento: " + conta2.getDiaRendimento());
        System.out.println("Nome: " + conta3.getCliente() + " Número da conta: " + conta3.getNumConta() + " Saldo: " + conta3.getSaldo() + " Limite: " + conta3.getLimite());
    
    }
    
}

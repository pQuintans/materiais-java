/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CartaoCredito cc1 = new CartaoCredito();
       CartaoCredito cc2 = new CartaoCredito();
       
       Dinheiro d1 = new Dinheiro();
       Dinheiro d2 = new Dinheiro();
       
       Cheque c1 = new Cheque();
       Cheque c2 = new Cheque();
       
        System.out.println("Dias de faturamento: " + cc1.getDiasFaturamento() + " dias e Porcentagem financeira: " +  cc1.getPorcentagemFinanceiraPaga()*100 + "%");
        System.out.println("Dias de faturamento: " + cc2.getDiasFaturamento() + " dias e Porcentagem financeira: " +  cc2.getPorcentagemFinanceiraPaga()*100 + "%");
       
       System.out.println("Dias de faturamento: " + d1.getDiasFaturamento() + " dias e Porcentagem financeira: " +  d1.getPorcentagemFinanceiraPaga()*100 + "%");
       System.out.println("Dias de faturamento: " + d2.getDiasFaturamento() + " dias e Porcentagem financeira: " +  d2.getPorcentagemFinanceiraPaga()*100 + "%");

       System.out.println("Dias de faturamento: " + c1.getDiasFaturamento() + " dias e Porcentagem financeira: " +  c1.getPorcentagemFinanceiraPaga()*100 + "%");
       System.out.println("Dias de faturamento: " + c2.getDiasFaturamento() + " dias e Porcentagem financeira: " +  c2.getPorcentagemFinanceiraPaga()*100 + "%");
    }
    
}

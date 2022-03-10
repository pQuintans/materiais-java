/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios3;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(14, 3, 1879, "Einstein", 9, 3, 2022);
        Pessoa p2 = new Pessoa(4, 1, 1643, "Newton", 9, 3, 2022);
        System.out.printf("Nome: %s, Idade: %d, Dia: %d, Mes: %d, Ano: %d\n", p1.getNome(), p1.getIdade(), p1.getDiaNas(), p1.getMesNas(), p1.getAnoNas());
        System.out.printf("Nome: %s, Idade: %d, Dia: %d, Mes: %d, Ano: %d\n", p2.getNome(), p2.getIdade(), p2.getDiaNas(), p2.getMesNas(), p2.getAnoNas());
        Pessoa p3 = new Pessoa(40, 32, 600, "INVALIDO", 9, 3, 2022);
        System.out.printf("Nome: %s, Idade: %d, Dia: %d, Mes: %d, Ano: %d\n", p3.getNome(), p3.getIdade(), p3.getDiaNas(), p3.getMesNas(), p3.getAnoNas());
        
        
    }
    
}

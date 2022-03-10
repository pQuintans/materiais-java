/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios1;

/**
 *
 * @author aluno
 */
public class ListaDeExercicios1 {

    /**
     * @param args the command line arguments
     */
    
    public static float salarioAnual(Funcionario func){
        float salarioAnual = func.getSalarioMen() * 12;
        return salarioAnual;
    }
    
    public static void main(String[] args) {
        Funcionario fabio = new Funcionario();
        Funcionario pedro = new Funcionario("Pedro", "Quintans", 250.00f);
        
        System.out.println("Nome e sobrenome: " + pedro.getNome() + " " + pedro.getSobrenome());
        System.out.println("Salario: " + pedro.getSalarioMen());
        
        System.out.println("Nome e sobrenome: " + fabio.getNome() + " " + fabio.getSobrenome());
        System.out.println("Salario: " + fabio.getSalarioMen());        
        
        fabio.setNome("Fabio");
        fabio.setSobrenome("Benedicto");
        fabio.setSalarioMen(-300.50f);
        
        System.out.println("Nome e sobrenome: " + fabio.getNome() + " " + fabio.getSobrenome());
        System.out.println("Salario: " + fabio.getSalarioMen());               
        
        fabio.setSalarioMen(300.50f);
        
        System.out.println("Salario: " + fabio.getSalarioMen());   
        
        System.out.println("Salario anual (" + fabio.getNome() + "): " + salarioAnual(fabio));
        System.out.println("Salario anual (" + pedro.getNome() + "): " + salarioAnual(pedro));
        
        fabio.setSalarioMen((float) (fabio.getSalarioMen() * 1.1));
        pedro.setSalarioMen((float) (pedro.getSalarioMen() * 1.1));
        
        System.out.println("Salario anual (" + fabio.getNome() + "): " + salarioAnual(fabio));
        System.out.println("Salario anual (" + pedro.getNome() + "): " + salarioAnual(pedro));
    }   
    
}

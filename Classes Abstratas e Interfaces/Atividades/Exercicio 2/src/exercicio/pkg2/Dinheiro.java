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
public class Dinheiro implements TipoPagamento {
    @Override
    public int getDiasFaturamento(){
        return 0;
    }
    
    @Override
    public double getPorcentagemFinanceiraPaga(){
        return 0.00;
    }
}

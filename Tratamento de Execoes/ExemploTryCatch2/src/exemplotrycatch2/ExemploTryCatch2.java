/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotrycatch2;

/**
 *
 * @author aluno
 */
public class ExemploTryCatch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        try{
            a1.setRa(-1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
           a1.setNome(null); 
        } catch( NullPointerException e) {
            System.out.println(e.getMessage());
        } catch ( StringVaziaException e){
            System.out.println(e.getMessage());
        }              
    }
    
}

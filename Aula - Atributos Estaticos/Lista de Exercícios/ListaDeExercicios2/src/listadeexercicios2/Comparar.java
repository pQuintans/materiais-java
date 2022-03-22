/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios2;

/**
 *
 * @author aluno
 */
public class Comparar {
    
    private static int parcial;
    
    public static int maior(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
    
    public static int maior(int a, int b, int c) {
        parcial = maior(a,b);
        return maior(parcial, c);
    }
    
    public static int maior(int a, int b, int c, int d) {
        parcial = maior(a,b,c);
        return maior(parcial, d);
    }
    
    public static int maior(int a, int b, int c, int d, int e) {
        parcial = maior(a,b,c,d);
        return maior(parcial, e);
    }    
    
    public static int menor(int a, int b) {
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
    
    public static int menor(int a, int b, int c) {
        parcial = menor(a,b);
        return menor(parcial, c);
    }
    
    public static int menor(int a, int b, int c, int d) {
        parcial = menor(a,b,c);
        return menor(parcial, d);
    }
    
    public static int menor(int a, int b, int c, int d, int e) {
        parcial = menor(a,b,c,d);
        return menor(parcial, e);
    }
}

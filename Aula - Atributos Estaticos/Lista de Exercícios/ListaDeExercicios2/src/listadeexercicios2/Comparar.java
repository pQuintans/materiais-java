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
    public static int maior(int a, int b) {
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
    
    public static int maior(int a, int b, int c) {
        int maiorParcial = maior(a,b);
        return maior(maiorParcial, c);
    }
    
    public static int maior(int a, int b, int c, int d) {
        int maiorParcial = maior(a,b,c);
        return maior(maiorParcial, d);
    }
    
    public static int maior(int a, int b, int c, int d, int e) {
        int maiorParcial = maior(a,b,c,d);
        return maior(maiorParcial, e);
    }    
    
    public static int menor(int a, int b) {
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
    
    public static int menor(int a, int b, int c) {
        int menorParcial = menor(a,b);
        return menor(menorParcial, c);
    }
    
    public static int menor(int a, int b, int c, int d) {
        int menorParcial = menor(a,b,c);
        return menor(menorParcial, d);
    }
    
    public static int menor(int a, int b, int c, int d, int e) {
        int menorParcial = menor(a,b,c,d);
        return menor(menorParcial, e);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercicio3;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class appFiguraGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Forma q1 = new Quadrado(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Forma r1 = new Retangulo(0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Forma r2 = new Retangulo(1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

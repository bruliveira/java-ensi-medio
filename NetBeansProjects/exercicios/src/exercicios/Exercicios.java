/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1;
        double n2;
        double m;
        
        Scanner teclado;
        teclado = new Scanner ( System.in);
        
        System.out.println("Digite a primeira nota");
        n1 = teclado.nextDouble();
        System.out.println("Digite a primeira nota");
        n2 = teclado.nextDouble();
        m = (n1 + n2)/2;
        System.out.println("Sua média final é: " + m);
        
        if (m>=6) {
            System.out.println("APROVADO");
        }else 
            System.out.println("REPROVADO");
    }
}

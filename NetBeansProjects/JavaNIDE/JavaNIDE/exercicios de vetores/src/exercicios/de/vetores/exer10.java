/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.de.vetores;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class exer10 {
    public static void main(String[] args) {
    
    Integer u [] = new Integer [10];
    int i;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("Digite os números para U:");
    u [i] = teclado.nextInt();
    }
    System.out.println("\nNovo vetor u:\n" + u[9]+ "\t"+ u[8]+"\t"+ u[7] +"\t"+ u[6] +"\t"+ u[5] +"\t"+ u[4] +"\t"+ u[3] +"\t"+ u[2] +"\t"+ u[1] +"\t"+ u[0]);
    }
}

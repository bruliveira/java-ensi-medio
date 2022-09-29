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
public class exer9 {
    public static void main(String[] args) {
    
    Integer r [] = new Integer [5];
    Integer s [] = new Integer [10];
    Integer x [] = new Integer [15];
    int i;
    int j;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("Digite os números para S:");
    s [i] = teclado.nextInt();
    }
    
    for (i = 0 ; i <= 4 ; i ++){
    System.out.println("Digite os números para R:");
    r [i] = teclado.nextInt();
    }
    
    for (i = 0 ; i <= 14 ; i ++){
    System.out.println("Digite os números para S:");
    x[0] = s[0];
    x[1] = s[1];
    x[2] = s[2];
    x[3] = s[3];
    x[4] = s[4];
    x[5] = s[5];
    x[6] = s[6];
    x[7] = s[7];
    x[8] = s[8];
    x[9] = s[9];
    x[10] = r[0];
    x[11] = r[1];
    x[12] = r[2];
    x[13] = r[3];
    x[14] = r[4];
           }
     System.out.println("\nNovo vetor X:\n" + x[0]+ "\t"+ x[1]+"\t"+ x[2] +"\t"+ x[3] +"\t"+ x[4] +"\t"+ x[5] +"\t"+ x[6] +"\t"+ x[7] +"\t"+ x[8] +"\t"+ x[9] +"\t"+ x[10] +"\t"+ x[11] +"\t"+ x[12] +"\t"+ x[13] +"\t"+ x[14]);
        

    }
}

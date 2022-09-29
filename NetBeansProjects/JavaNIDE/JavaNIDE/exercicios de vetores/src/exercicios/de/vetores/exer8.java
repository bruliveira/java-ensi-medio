/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.de.vetores;

import java.util.Scanner;

/**
 *
 * @author Turma 2017
 */
public class exer8 {
    public static void main(String[] args) {
    
    Integer w [] = new Integer [10];
    int i;
    int v;
    int cont = 0;
    Integer p [] = new Integer [10];
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite um valor V");
    v =  teclado.nextInt();
    
    System.out.println("\nDigite os valores para W:");
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("Digite um número:");
           w [i] = teclado.nextInt();
           if ( w [i] == v){
               System.out.println("Esse número aparece na Posição " + i + "  novamente ");
           cont++;
           } else {
               System.out.println("Esse número é diferente do de V");
           }
    }
        System.out.println("\nO valor de V aparece " + cont + " vezes");
       
    }
}

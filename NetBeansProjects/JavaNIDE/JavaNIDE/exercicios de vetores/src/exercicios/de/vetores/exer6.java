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
public class exer6 {
    public static void main(String[] args) {
    
    
        Integer v [] = new Integer [10];
        int i;
        int m = 0;
        int p=0;
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite dez valores abaixo:");
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("\nDigite um número:");
           v[i] = teclado.nextInt();
           while (v[i] < 0){
               System.out.println("Digite um número que não seja negativo");
               v[i] = teclado.nextInt();
           }
           if ( v[i] > m){
           m = v[i];
           p = i;
          }
     }
        System.out.println("\nO maior valor é: " + m );
        System.out.println("Está na " + p +  "° posição" );
    }
}

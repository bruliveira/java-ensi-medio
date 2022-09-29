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
public class exer5 {
   public static void main(String[] args) {
   
       Integer v [] = new Integer [10];
       Integer vp [] = new Integer [10];
       int i;
       
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite dez valores");
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("\nDigite um número:");
           v[i] = teclado.nextInt();
           
           if ( v[i] % 2 == 0 ){
           vp[i] = 0;
           }else{
           vp[i] = 1;
           }   
    }
    System.out.println("\nEsses são os novos valores");
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println(vp[i]);
    }
   } 
}

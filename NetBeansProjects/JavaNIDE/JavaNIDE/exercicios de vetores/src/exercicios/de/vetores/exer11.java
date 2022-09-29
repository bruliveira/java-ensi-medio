/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  exercicios.de.vetores;

import java.util.Scanner;

/**
 *
 * @author izael
 */
public class exer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer r[] = new Integer [5];
       Integer t[] = new Integer [10];
       Integer x[] = new Integer [5];

 Scanner teclado;
 teclado  = new Scanner (System.in);
        int i;
        int j;
        System.out.println("Insira 5 valores para o vetor R");
 for (i=0; i<5;i++){
 r[i] = teclado.nextInt();

 }
         System.out.println("Insira 10 valores para o vetor T");

 for (j=0; j<10;j++){
 t[j] = teclado.nextInt();
 
 
 }

 for (i=0; i<5;i++){
 for (j=0;j<10;j++){
 if (r[i] == t[j]){
 x[i] = r[i];
 }
 }
 
 }
        System.out.println("os valores comuns dentre os vetores r e t são:");
  for (i=0; i<5;i++){
      System.out.println(x[i]);
  }
 }

 
    }
    


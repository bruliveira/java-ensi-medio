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
public class exer7 {
  public static void main(String[] args) {
  
      Integer x [] = new Integer [10];
      Integer y [] = new Integer [10];
      int i;
      
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite dez valores para X abaixo:");
    for (i = 0 ; i <= 9 ; i ++){
    System.out.println("\nDigite um número:");
           x [i] = teclado.nextInt();           
           while (x[i] < 0){
               System.out.println("Digite um número positivo");
               x[i] = teclado.nextInt();
           }
           
           if ( x[i] % 2 == 0 ){
           y [i] = x[i] / 2 ;
                   
           }else {
           y[i] = x[i] * 3;
           }
          
  }
              System.out.println("\nsequencia de X\n" + x[0]);
              System.out.println(x[1]);
              System.out.println(x[2]);
              System.out.println(x[3]);
              System.out.println(x[4]);
              System.out.println(x[5]);
              System.out.println(x[6]);
              System.out.println(x[7]);
              System.out.println(x[8]);
              System.out.println(x[9]);
              System.out.println("\nsequencia de Y\n" + y[0]);
              System.out.println(y[1]);
              System.out.println(y[2]);
              System.out.println(y[3]);
              System.out.println(y[4]);
              System.out.println(y[5]);
              System.out.println(y[6]);
              System.out.println(y[7]);
              System.out.println(y[8]);
              System.out.println(y[9]);
  }
}

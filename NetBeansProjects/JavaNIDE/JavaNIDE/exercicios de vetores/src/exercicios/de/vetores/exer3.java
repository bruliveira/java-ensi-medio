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
public class exer3 {
    public static void main(String[] args) {
    
       Integer v [] = new Integer [5];
       String n[] = new String [5];
       int i;
       int cont = 0;
       double m = 0;
       
       Scanner teclado;
       teclado = new Scanner ( System.in );
       
       for (i = 0 ; i <= 4 ; i ++){
           System.out.println("\nDigite o nome do produto " + i);
           n[i] = teclado.next();
           System.out.println("Digite o preço  do produto " + i);
           v[i] = teclado.nextInt();
           
           if ( v [i] > 50 ){
           cont++;
           }else if ( v[i] >= 50 && v[i] <=100){
               System.out.println(" O prço do(a)" +  n[i]+ "está entre 50 e 100");
           }else if ( v[i] > 100){
            m = m + v [i];
           }
           }
        System.out.println("Possui " + cont + " Produtos com valor abaixo de 50");
        System.out.println("A média do preço dos produtos é : " + m/5);
           
           
       }
        
    }


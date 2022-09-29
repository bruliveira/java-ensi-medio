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
public class exer1 {
         public static void main(String[] args) {
         
                Integer v [] = new Integer [10];
                int i; 
                int cont=0;
                int conti=0;
                    Scanner teclado;
                    teclado = new Scanner ( System.in );
    
        for (i = 0 ; i <= 9 ; i ++){
            System.out.println(" Digite os números desejados ");
            v[i] = teclado.nextInt();
         if ( v[i] < 0 ){
             cont ++;
         }else {
             conti = conti + v[i];
        }
        }        
             System.out.println("\tExiste : " + cont + " números negativos");
             System.out.println("\tA soma de todos os  positivos é : " + conti);
         }
}

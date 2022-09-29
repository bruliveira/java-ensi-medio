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
public class exer2 {
    public static void main(String[] args) {
         
            Integer v [] = new Integer [6]; 
            int i;
            int cont=0;
            int conti=0;
            
            Scanner teclado;
            teclado = new Scanner ( System.in );
            
            for (i = 0 ; i <= 5 ; i ++){
                System.out.println(" \nOlá senhor(a) digite o número desejado para " + i + " : ");
                v[i] = teclado.nextInt();
                    if ( v[i] % 2 == 0 ){
                        System.out.println("O número " + v[i] + " é par");
                        cont++;  
                    }else {
                        System.out.println("O número " + v[i] + " é impar");
                        conti++;
                    }
            }
          System.out.println("\n\tO total de números pares é : " + cont);
          System.out.println("\tO total de números impares é : " + cont);
}
}

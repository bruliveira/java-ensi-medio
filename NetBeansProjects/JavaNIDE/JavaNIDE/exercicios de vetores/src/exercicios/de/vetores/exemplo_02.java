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
public class exemplo_02 {
     public static void main(String[] args) {
     
     String v [] = new String [8];
         
    v [4] = "primavera"; 
    v [5] = "verão"; 
    v [6] = "outono"; 
    v [7] = "inverno"; 
     System.out.println("\tPrimeiro vetor :");
     System.out.println(v[4]);
     System.out.println(v[5]);
     System.out.println(v[6]);
     System.out.println(v[7]);
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
     System.out.println("\tSegundo vetor : ");
     for (int i = 0; i <=  3 ; i++ ){
       v[i] = teclado.nextLine();
     }
     System.out.println(v[4]);
     System.out.println(v[5]);
     System.out.println(v[6]);
     System.out.println(v[7]);
     }
}

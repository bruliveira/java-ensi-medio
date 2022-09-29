/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class exercicio07 {
   public static void main(String[] args) {
  
    
    int idade ;
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite sua idade");
    idade = teclado.nextInt();
 
    switch(idade){
        case 0:
     System.out.println("BABY");
     break;
        case 1:
     System.out.println("BABY");
     break;
        case 2:
     System.out.println("BABY");
     break;
        case 3:
     System.out.println("BABY");
     break;
        case 4:
     System.out.println("INFANTIL A");
     break;
        case 5:
     System.out.println("INFANTIL A");
     break;
        case 6:
     System.out.println("INFANTIL A");
     break;
        case 7:
     System.out.println("INFANTIL A");
     break;
        case 8:
     System.out.println("INFANTIL B");
     break;
        case 9:
     System.out.println("INFANTIL B");
     break;
        case 10:
     System.out.println("INFANTIL B");
     break;
        case 11:
     System.out.println("INFANTIL B");
     break;
         case 12:
     System.out.println("JUVENIL A");
     break;
         case 13:
     System.out.println("JUVENIL A");
     break;
         case 14:
     System.out.println("JUVENIL B");
     break;
         case 15:
     System.out.println("JUVENIL B");
     break;
         case 16:
     System.out.println("JUVENIL B");
     break;
         case 17:
     System.out.println("JUVENIL B");
     break;
         default:
     System.out.println("ADULTO");
     break;
     
    }
    
}
}
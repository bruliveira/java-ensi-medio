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
public class exercicio08 {
    public static void main(String[] args) {
  
    int idade ;
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite sua idade");
    idade = teclado.nextInt();
 
    switch(idade){
        case 0:
     System.out.println("Idade não permitida");
     break;
        case 1:
     System.out.println("Idade não permitida");
     break;
        case 2:
     System.out.println("Ensino Infantil");
     break;
        case 3:
     System.out.println("Ensino Infantil");
     break;
        case 4:
     System.out.println("Ensino Infantil");
     break;
        case 5:
     System.out.println("Ensino Infantil");
     break;
        case 6:
     System.out.println("Ensino Fundamental");
     break;
        case 7:
     System.out.println("Ensino Fundamental");
     break;
        case 8:
     System.out.println("Ensino Fundamental");
     break;
        case 9:
     System.out.println("Ensino Fundamental");
     break;
        case 10:
     System.out.println("Ensino Fundamental");
     break;
        case 11:
     System.out.println("Ensino Fundamental");
     break;
         case 12:
     System.out.println("Ensino Fundamental");
     break;
         case 13:
     System.out.println("Ensino Fundamental");
     break;
         case 14:
     System.out.println("Ensino Fundamental");
     break;
         case 15:
     System.out.println("Ensino Médio");
     break;
         case 16:
     System.out.println("Ensino Médio");
     break;
         case 17:
     System.out.println("Ensino Médio");
     break;
         default:
     System.out.println("Ensino Superior");
     break;
     
    }
    
} 
}

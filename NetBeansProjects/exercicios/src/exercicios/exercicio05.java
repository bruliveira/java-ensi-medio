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
public class exercicio05 {
         public static void main(String[] args) {
  
    int n;
    
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Por favor digite um número");
    n = teclado.nextInt();
    
    if (n==0){
        System.out.println(n+" é ZERO");
    }else if (n%2==0){
        System.out.println(n+" é PAR");
    }else{
        System.out.println(n+" é ÍMPAR");
    }     
    }
}

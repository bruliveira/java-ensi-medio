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
public class exercicio03 {
public static void main(String[] args) {
  
    int n;
      
    Scanner teclado;
    teclado = new Scanner ( System.in );    

    System.out.println("Digite um número");
    n = teclado.nextInt();
     
    if (n<0){
        System.out.println(n + " é negativo");
    }else if (n==0){
        System.out.println(n + " é zero");
    }else if(n>0){
        System.out.println(n + " é positivo");
    }else {
        System.out.println(n + " não indentificado");
    }
}
}
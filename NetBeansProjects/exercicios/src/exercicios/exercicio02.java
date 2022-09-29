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
public class exercicio02 {
  public static void main(String[] args) {
  
    int n;
      
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite um número");
    n = teclado.nextInt();
        
    if (n >= 10 && n<=20){
        System.out.println("Este número esta no intervalo entre 10 e 20");
    }else if (n >= 100 && n<=200){
        System.out.println("Este número esta no intervalo entre 100 e 200");
    }else {
        System.out.println("Este devido número não foi indetificando");
    }
  }  
}

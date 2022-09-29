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
public class exercicio04 {
     public static void main(String[] args) {
  
    int aa;
    int an;
    int idade;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Por favor digite o ano que você nasceu");
    an = teclado.nextInt();

    System.out.println("Por favor digite o ano em que estamos");
    aa = teclado.nextInt();
    
    idade = aa - an;
    
    if (idade >= 16 ){
        System.out.println("Olá Você tem "+idade+" e você já pode votar");
    }else {
        System.out.println("Olá você ainda tem "+idade+" e não pode votar");
    }
     }
}

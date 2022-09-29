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
public class erxecicio01 {
public static void main(String[] args) {

    double n1;
    double n2;        
    double n3;
    double m;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite sua primeira nota");
        n1 = teclado.nextDouble();
    System.out.println("Digite sua segunda nota");
        n2 = teclado.nextDouble();
    System.out.println("Digite sua terceira nota");
        n3 = teclado.nextDouble();
        m =(n1 * 2 + n2 * 3 + n3 * 5) / 10;
    System.out.println("Sua média final é:" + m );    
    
    if ( m >= 7){
        System.out.println("VERDADEIRO");
        
    }else{
        System.out.println("FALSO");
    }
}           
}

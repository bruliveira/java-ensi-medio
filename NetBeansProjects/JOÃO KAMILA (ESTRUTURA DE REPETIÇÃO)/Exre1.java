/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exre1;

import java.util.Scanner;

/**
 *
 * @author Turma2017
 */
public class Exre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
                 teclado = new Scanner(System.in);
             int n1;  
              int n2;
              int div;
              System.out.println("digite um número");
              n1 = teclado.nextInt();
              System.out.println("digite outro número");
              n2 = teclado.nextInt(); 
              while(n2 == 0){
                  System.out.println("opção inválida,digite outro número");
              n2 = teclado.nextInt();
              }
              div = (n1/n2);
              System.out.println("este é o resultado da divisão:" + div);
    }
    
}

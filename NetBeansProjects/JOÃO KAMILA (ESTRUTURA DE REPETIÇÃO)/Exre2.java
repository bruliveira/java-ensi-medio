/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exre2;

import java.util.Scanner;

/**
 *
 * @author Turma2017
 */
public class Exre2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
        teclado = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("insira um valor");
        n1   = teclado.nextInt();
        System.out.println("insira outro valor");
        n2 = teclado.nextInt();
        while(n2 == n1 ){
            System.out.println("opção inválida,digite outro valor");
            n2 = teclado.nextInt();
    }
        System.out.println("insira outro valor");
        n3 = teclado.nextInt();
        while(n3 == n1 || n3 == n2){
        System.out.println("opção inválida,digite outro valor");
            n3 = teclado.nextInt();
        }
        System.out.println("          ");
        if(n1 > n2 & n2 > n3){
            System.out.println(n3);
            System.out.println(n2);
        System.out.println(n1);
        }
        else if (n1 > n3 & n3 > n2){
             System.out.println(n2);
            System.out.println(n3);
        System.out.println(n1);
            
        }
        else if (n2 > n3 & n3 > n1){
             System.out.println(n1);
            System.out.println(n3);
        System.out.println(n2);  
        }
       else if (n2 > n1 & n1 > n3){
             System.out.println(n3);
            System.out.println(n1);
        System.out.println(n2);   
        }
        else if (n3 > n1 & n1 > n2){
             System.out.println(n2);
            System.out.println(n1);
        System.out.println(n3);  
        }
        else{
             System.out.println(n1);
            System.out.println(n2);
        System.out.println(n3);
            
        }
    }
    
}

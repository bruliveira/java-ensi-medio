/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr03;

import java.util.Scanner;

/**
 *
 * @author Turma2017
 */
public class EXR03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado;
         teclado = new Scanner (System.in);
         int n1 ;
         int n2;
         int M;
       String a;
       a="s";
         while(!"n".equals(a)){
         System.out.println("digite o número");
         n1 = teclado.nextInt();
         while( n1 > 10 || n1 < 0){
           System.out.println("digite novamente um numero");
         n1 = teclado.nextInt();
         }
         System.out.println("digite o número");
         n2 = teclado.nextInt();
         while( n2 > 10 || n2 < 0){
           System.out.println("digite novamente um numero");
         n2 = teclado.nextInt();
         }
        M =( n1 + n2) / 2;
        System.out.println("esta é sua média:" + M);
        if (M >= 7 ){
            System.out.println("aprovado");    
        }
        else if (M<=6.9 & M>=4){
            System.out.println("recuperação");
        }
        else {
            System.out.println("reprovado");
        }
             System.out.println("deseja reinicializar o calculo? digite S para sim ,N para não");
             a=teclado.next();
         }    
    
        
    }
    
}

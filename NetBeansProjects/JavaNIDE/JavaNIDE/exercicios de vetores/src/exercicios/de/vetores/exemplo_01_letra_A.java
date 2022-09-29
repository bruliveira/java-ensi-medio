/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.de.vetores;

import java.util.Scanner;

/**
 *
 * @author Turma 2017
 */
public class exemplo_01_letra_A {
    public static void main(String[] args) {
    
    
    Integer v [] = new Integer [5];
    int s = 0;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
   
    for (int i = 0; i <=  4 ; i++ ){
        
       v[i] = teclado.nextInt();
         
 
        if ( v[i]==0){
        System.out.print( v[i]+" é ZERO");
    }else if ( v[i]%2==0){
        System.out.print( v[i]+" é PAR");
    }else{
        System.out.print( v[i]+" é ÍMPAR");
    }    
     
    if ( v[i]<0){
        System.out.println(" e é NEGATIVO");
    }else if ( v[i]==0){
        System.out.println(" e é ZERO");
    }else {
        System.out.println(" e é POSITIVO");
    }
                 s = s + v[i];
    }
     System.out.println("a soma e " + s);
       
    }
}

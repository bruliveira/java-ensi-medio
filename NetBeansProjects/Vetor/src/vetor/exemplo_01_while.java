/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
public class exemplo_01_while {
    public static void main(String[] args) {
    Integer v [ ] = new Integer [ 5 ]; 
    int s = 0;    
    
 Scanner teclado;
teclado = new Scanner(System.in);
        int i = 0 ;

  while ( v [ i ] < 4){   
    v [ i ] =  teclado.nextInt();
  
  if (v [ i ]==0){
        System.out.print(v [ i ]+" é ZERO");
    }else if (v [ i ]%2==0){
        System.out.print(v [ i ]+" é PAR");
    }else{
        System.out.print(v [ i ]+" é ÍMPAR");
    }    
  
  if (v [ i ]<0){
        System.out.println(" e é NEGATIVO");
    }else if (v [ i ]==0){
        System.out.println(" e é ZERO");
    }else {
        System.out.println(" e é POSITIVO");
    }
  }
}
}
        
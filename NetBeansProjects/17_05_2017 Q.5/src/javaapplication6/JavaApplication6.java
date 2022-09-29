
package javaapplication6;

import java.util.Scanner;
/*5)Preencher de forma automática um vetor de 10 elementos com 1 se o índice do elemento 
for ímpar e com 0 se for par.Escrever o vetor após o seu total preenchimento.*/
public class JavaApplication6 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        Integer v[] = new Integer [10];
           int i;
      System.out.println("Legenda: Se o valor do Vetor for Impar Séra Digitado 1 Caso Seja Par Sera Digitado 0");
      for ( i = 0; i < v.length; i++){
       if (i % 2 == 1){
            System.out.println("Vet: 1");
       }else{
           System.out.println("Vet: 0");
       }
      }
    }
}

        
        
     

        
  
    
    


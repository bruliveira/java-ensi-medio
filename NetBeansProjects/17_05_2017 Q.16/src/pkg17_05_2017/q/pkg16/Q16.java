
package pkg17_05_2017.q.pkg16;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
        Integer r[] = new Integer [5];
        Integer u[] = new Integer [5];
        Integer t[] = new Integer [10];
        int i;

        
               
      for ( i = 0; i < u.length; i++){
           System.out.println("Digite os Valores Para o Vetor U a Seguir:");
          u[ i ] = teclado.nextInt();
           System.out.println("Digite os Valores Para o Vetor R a Seguir:");
          r[ i ] = teclado.nextInt();
      
          if (r[i] == u[i]){
          System.out.println("Número Igual Detectado Repita o Processo:");
          r[ i ] = teclado.nextInt();
    }
     
     
      
      t[0] = r[0];
      t[1] = r[1];
      t[2] = r[2];
      t[3] = r[3];
      t[4] = r[4];
      
      t[5] = u[0];
      t[6] = u[1];
      t[7] = u[2];
      t[8] = u[3];
      t[9] = u[4];
   
             
      System.out.println("O Resultado da Organização do Vetor T Ficou:");
      
      System.out.println(+ t[0]);
      System.out.println(+ t[1]);
      System.out.println(+ t[2]);
      System.out.println(+ t[3]);
      System.out.println(+ t[4]);
      System.out.println(+ t[5]);
      System.out.println(+ t[6]);
      System.out.println(+ t[7]);
      System.out.println(+ t[8]);
      System.out.println(+ t[9]);
    }
    }
}


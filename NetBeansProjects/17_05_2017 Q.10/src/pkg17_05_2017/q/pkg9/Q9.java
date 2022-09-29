
package pkg17_05_2017.q.pkg9;

import java.util.Scanner;
/*10)Ler um vetor U de 10 elementos.A seguir trocar o primeiro elemento com o último,o segundo com penúltimo etc.até o quinto com o sexto e escrever o vetor U assim modificado.*/
public class Q9 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        Integer u[] = new Integer [10];
        int i;
        int troca1;
        int troca2;

        
                System.out.println("Digite os Valores Para o Vetor a Seguir:");
      for ( i = 0; i < u.length; i++){
          u[ i ] = teclado.nextInt();
      
    }
      troca1 = u[0];
      troca2 = u[9];
      u[0] = troca2;
      u[9] = troca1;
      
      troca1 = u[1];
      troca2 = u[8];
      u[1] = troca2;
      u[8] = troca1;
      
      troca1 = u[2];
      troca2 = u[7];
      u[2] = troca2;
      u[7] = troca1;
      
      troca1 = u[3];
      troca2 = u[6];
      u[3] = troca2;
      u[6] = troca1;
      
      troca1 = u[4];
      troca2 = u[5];
      u[4] = troca2;
      u[5] = troca1;
             
      System.out.println("O Resultado da Troca Ficou:");
      
      System.out.println(+ u[0]);
      System.out.println(+ u[1]);
      System.out.println(+ u[2]);
      System.out.println(+ u[3]);
      System.out.println(+ u[4]);
      System.out.println(+ u[5]);
      System.out.println(+ u[6]);
      System.out.println(+ u[7]);
      System.out.println(+ u[8]);
      System.out.println(+ u[9]);
  }
}
    


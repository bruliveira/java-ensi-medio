
package q13;

import java.util.Scanner;

public class Q13 {

   /* 13) - Ler um vetor X de 10 elementos inteiros e positivos. Garanta que não haja números repetidos no vetor e ordene-os e
    apresente este em ordem crescente e em seguida em ordem decrescente.*/
    
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
   
        Integer T [] = new Integer[10];
        int a;
        int i;
        
         for (i = 0; i < T.length; i++) {
            System.out.print("VALOR T :");
            T[i] = teclado.nextInt();
         }
            for (i = 0; i < T.length;i++){
                for (int j = 0; j < (T.length - 1);j++){
                    if (T[j]> T[j + 1]){
                        a = T[j];
                        T [j] = T [j+1];
                        T [j+1] = a;
                    }
                }
            }
            System.out.println("Cresc:");
            for (i = 0; i < T.length;i++){
                System.out.println("" + T[i]);
            }
            System.out.println("\n");
            for (i = 0; i < T.length;i++){
                for (int j = 0; j < (T.length - 1);j++){
                    if (T[j]< T[j + 1]){
                        a = T[j];
                        T [j] = T [j+1];
                        T [j+1] = a;
                    }
                }
            }
            System.out.println("Decresc:");
            for (i = 0; i < T.length;i++){
                System.out.println("" + T[i]);
            }
            System.out.println("\n");
 
    }
}
    



package vetor;

import java.util.Scanner;

public class VetorAt01 {
     public static void main(String[] args) {
         int i;
         int cont = 0;
         int conti = 0;
         Scanner teclado;
         teclado = new Scanner(System.in);
         Integer v[] = new Integer [10];
         for (i = 0; i <= 9; i++){
             System.out.println("Digite o índice "+i+":");
         v[i] = teclado.nextInt();
         if ( v[i] < 0){
         cont++;
         }
         else {
         conti = conti + v[i];
         }
         }
         System.out.println("Possui "+cont+" números negativos");
         System.out.println("A soma dos números positivos é:"+conti);
     }
    
}

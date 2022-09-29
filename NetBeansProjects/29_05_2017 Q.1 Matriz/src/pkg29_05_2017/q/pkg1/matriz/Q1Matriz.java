
package pkg29_05_2017.q.pkg1.matriz;

import java.util.Scanner;

public class Q1Matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A[][] = new int[5][3];
        int B[][] = new int[5][3];
        int S[][] = new int[5][3];
        int D[][] = new int[5][3];
        /*--------------------------------------------------*/
        System.out.print("De Valores a Matriz A\n");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                A[ i ][ j ] = teclado.nextInt();
            }
        }
        System.out.print("De Valores a Matriz B\n");
             for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                B[ i ][ j ] = teclado.nextInt();
            }
        }
             
         for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }   
         
         for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                D[i][j] = A[i][j] - B[i][j];
            }
        } 
      
        /*--------------------------------------------------*/
         System.out.print("Mat: A\n");
        for (int i = 0; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j <= 2; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
 
    }
         System.out.print("Mat: B\n");
        for (int i = 0; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j <= 2; j++) {
                System.out.print(B[i][j] + "|");
            }
           
            System.out.println("");
    }
    System.out.print("Mat: S\n");
        for (int i = 0; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j <= 2; j++) {
                System.out.print(S[i][j] + "|");
            }
           
            System.out.println("");
    }
        System.out.print("Mat: D\n");
        for (int i = 0; i <= 4; i++) {
            System.out.print("|");
            for (int j = 0; j <= 2; j++) {
                System.out.print(D[i][j] + "|");
            }
           
            System.out.println("");
    }
}
}
    
    

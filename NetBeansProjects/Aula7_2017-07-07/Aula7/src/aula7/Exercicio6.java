/*
 * Preencha uma matriz 5x5 com numeros inteiros
 * e mostre na tela.
 */
package aula7;
import java.util.Random;
public class Exercicio6 {
    public static void main(String args[]){
        int mat[][] = new int[5][5];
        
        //OBJETO gerador de números aleatórios
        Random r = new Random();
        
        for(int x = 0; x < 5; x++){
            for(int y = 0; y <5; y++){
                mat[x][y] = r.nextInt(100);  //inteiro 0 a 99
                System.out.print(mat[x][y] + "\t");
            }//for-y
            System.out.println("");
        }//for-x
    }//main
}//class

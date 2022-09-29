/*
5° Escreva um algoritmo que imprima as seguintes sequencias de numeros: 
(1, 1 2 3 4 5 6 7 8 9 10) (1, 1 2 3 4 5 6 7 8 9 10) ... e assim sucessivamente,
 até que o primeiro numero (antes da virgula), tambem chegue a 10.
*/
package javaapplication21;

import javax.swing.JOptionPane;

public class JavaApplication21 {

    public static void main(String[] args) {

for(int i = 1; i <= 10; i++){
            System.out.println(i + ", (1,2,3,4,5,6,7,8,9,10)");
            }

    }
}

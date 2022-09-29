
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
        Integer v[] = new Integer [5];
        
        int i=0;
        int soma = 0;
        
      
        while(i < v.length){
            System.out.println("VALOR: "+ i);
        v[ i ] = teclado.nextInt();
        soma = soma + v[i];
        i = i+1;
        
        }

        System.out.println("O valor da soma e:"+ soma);
    }
    
}


    
    


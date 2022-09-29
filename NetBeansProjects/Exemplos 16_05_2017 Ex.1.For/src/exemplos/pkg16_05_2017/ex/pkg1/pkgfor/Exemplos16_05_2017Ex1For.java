
package exemplos.pkg16_05_2017.ex.pkg1.pkgfor;

import java.util.Scanner;

public class Exemplos16_05_2017Ex1For {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        Integer v[] = new Integer [5];
        int i;
        int soma = 0;
        
                
      for ( i = 0; i < v.length; i++){
       
            System.out.println("VALOR: "+ i);
        v[ i ] = teclado.nextInt();
        soma = soma + v[i];
        
    }

        System.out.println("O valor da soma e:"+ soma);
    }
    
}


    
    


package exemplos.pkg16_05_2017.ex.pkg1;

import java.util.Scanner;

public class Exemplos16_05_2017Ex1 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        Integer v[] = new Integer [5];
           
      
        int i=0;
        int soma = 0;
        do {
            System.out.println("VALOR: "+ i);
        v[ i ] = teclado.nextInt();
        soma = soma + v[i];
        i = i+1;
        
        
        }while (i < v.length);
        System.out.println("Valo da Soma e: "+ i);
        }

        
    }
    



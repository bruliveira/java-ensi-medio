
package exercicio.vetores.pkg17_05_2017.q.pkg1;

import java.util.Scanner;

public class ExercicioVetores17_05_2017Q1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double v[] = new double [10];
           
      
        float i=0;
        int soma = 0;
        do {
            System.out.println("VALOR: "+ i);
            v[ i ] = ler.nextdouble();
        
        
        }while (i < v.length);
        System.out.println("Valo da Soma e: "+ i);
        }
    }
    


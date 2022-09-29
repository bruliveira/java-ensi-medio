
package exerciciovetores.pkg17_05_2017.q.pkg6;

import java.util.Scanner;

public class ExercicioVetores17_05_2017Q6 {

    public static void main(String[] args) {
 
       Scanner teclado = new Scanner(System.in);
        Integer v[] = new Integer [10];
        int i;
        int maior = 0;
        int x = 0;
        
                System.out.println("Digite os Valores Para o Vetor a Seguir:");
      for ( i = 0; i < v.length; i++){
          v[ i ] = teclado.nextInt();
       if (v[i] > 0 ){
        maior = i;
        x = v[i];
        
       }else{
           System.out.println("Digite Outro Valor Pois o Digitado e Negativo");
       }
            
       
                
        
    }
System.out.println("O Valor do Maior Elemento o Vetor e:"+ maior);
        System.out.println("A posição do Maior Numero no Vetor e:"+ x);  
    }
    
}

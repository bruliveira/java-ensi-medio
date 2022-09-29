
import java.util.Scanner;

public class EXERCICIO03 {

   
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        double media;
        
        Scanner teclado; 
         teclado = new Scanner (System.in);
         System.out.println("Digite a primeira nota:");
         nota1= teclado.nextDouble();
          System.out.println("Digite a segunda nota:");

         nota2= teclado.nextDouble();
          System.out.println("Digite a terceira nota:");

         nota3= teclado.nextDouble();
         media = (nota1*2+ nota2*3 + nota3*5) / 10;
         
         if (media>=7) {
             System.out.println("MÉDIA FINAL: " + media);
             System.out.println("VERDADEIRO");
             
         }
         
         else if  ((media<7) && (media>=4))   {
             System.out.println("MÉDIA FINAL: " + media);
             System.out.println("FALSO");
         }
         else  {
             System.out.println("MÉDIA FINAL: " + media);
             System.out.println("FALSO");
         }
    }
        
               

    }
    


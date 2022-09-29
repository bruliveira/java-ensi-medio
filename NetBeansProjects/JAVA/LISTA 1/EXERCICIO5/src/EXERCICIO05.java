
import java.util.Scanner;


public class EXERCICIO05 {

   
    public static void main(String[] args) {
        
        int numero;
        
        Scanner teclado;
        
        teclado = new Scanner (System.in);
        System.out.println("Digite um valor:");
        numero = teclado.nextInt();
        
        if (numero > 0){
            System.out.println("O VALOR É POSITIVO");
        }
        
        else if(numero == 0){
            System.out.println("O VALOR É ZERO");
        }
                
        else {
            System.out.println("O VALOR É NEGATIVO ");
        }
        
        
        
   
    }
    
}

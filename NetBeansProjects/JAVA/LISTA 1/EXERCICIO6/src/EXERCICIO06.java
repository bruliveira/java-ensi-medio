
import java.util.Scanner;


public class EXERCICIO06 {

   
    public static void main(String[] args) {
        int anonasc;
       int anoatual;
       int idade;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Digite seu ano de nascimento:");
        anonasc = teclado.nextInt();
        System.out.println("Digite ano atual:");
        anoatual = teclado.nextInt();
        idade  = anoatual - anonasc;
        System.out.println("Sua idade é " + idade);
        
        if(idade >= 18){
        
            System.out.println("VOTO OBRIGATÓRIO!");
        
        
        }
        else if((idade == 16) || (idade == 17)){
        
            System.out.println("VOTO OPCIONAL");
        }
        
        else {
            System.out.println("SEM IDADE SUFICIENTE PARA VOTO");
        }
                                                                 
    }
    
}

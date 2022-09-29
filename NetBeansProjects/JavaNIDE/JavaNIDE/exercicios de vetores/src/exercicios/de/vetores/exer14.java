package  exercicios.de.vetores;
import java.util.Scanner;
public class exer14 {

    public static void main(String[] args) {
        int i;
        int j;
        int aux;
        boolean controle;
        
        int x[] = new int [10];
               
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Seu vetor: ");
        for(i = 0; i < 10; i++) {
            System.out.println("Insira o valor da posição [" + i + "]: ");
            x[i] = teclado.nextInt();
        }
        
        for(i = 0; i < 10; i++) {
            controle = true;
            for(j = 0; j < 10 - 1; j++) {
                if(x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                    controle = false;
                }
            }
            if(controle) {
                break;
            }
        }
        System.out.println("\nEm ordem crescente:");
        for(i = 0; i < 10; i++) {
            System.out.print("[" + x[i] + "]");
        }
        
        for(i = 0; i < 10; i++) {
            controle = true;
            for(j= 0; j < 10 - 1; j++) {
                if(x[j] < x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                    controle = false;
                }
            }
            if(controle) {
                break;
            }
        }
        System.out.println("\nEm ordem decrescente:");
        for(i = 0; i < 10; i++) {
            System.out.print("[" + x[i] + "]");
        }
    }
}
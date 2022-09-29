package  exercicios.de.vetores;
import java.util.Scanner;
public class exer13 {

    public static void main(String[] args) {
        int i;
        int j;
        int aux;
        boolean controle;
        int vet[] = new int [8];
        
        vet[0] = 5;
        vet[1] = 1;
        vet[2] = 4;
        vet[3] = 2;
        vet[4] = 7;
        vet[5] = 8;
        vet[6] = 3;
        vet[7] = 6;
        
        System.out.println("Seu vetor: ");
        for(i = 0; i < 8; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        
        for(i = 0; i < 8; i++) {
            
            controle = true;
            
            for(j = 0; (j < 8 - 1); j++) {
                if(vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    controle = false; 
                }
            }
            if(controle) {
                break;
            }         
        }
        System.out.println("\nEm ordem crescente:");
        for(i = 0; i < 8; i++) {
            System.out.print("[" + vet[i] + "]");
        }
        
        for(i = 0; i < 8; i++) {
            
            controle = true;
            
            for(j = 0; (j < 8 - 1); j++) {
                if(vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    controle = false; 
                }
            }
            if(controle) {
                break;
            }         
        }
        System.out.println("\nEm ordem decrescente:");
        for(i = 0; i < 8; i++) {
            System.out.print("[" + vet[i] + "]");
        }
    }
    
}
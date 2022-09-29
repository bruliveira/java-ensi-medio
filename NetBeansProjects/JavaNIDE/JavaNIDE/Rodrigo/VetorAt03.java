/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author Turma 2017
 */
public class VetorAt03 {
    public static void main(String[] args) {
        Scanner teclado;
         teclado = new Scanner(System.in);
         
         int i;
         double m = 0;
         int cont = 0;
         Integer v[] = new Integer [5];
         String n[] = new String [5];
         
         for (i = 0; i <= 4; i++){
             System.out.println("Digite o nome do produto que está no índice "+i+":");
              n[i] = teclado.next();
             System.out.println("Digite o valor do produto que está no índice "+i+":");
              v[i] = teclado.nextInt();
              if (v[i] < 50){
              cont++;
              }
              else if (v[i] >= 50 && v[i] <= 100){
              System.out.println("O preço do(a) "+n[i]+" está entre 50 e 100");
              }
              else if  (v[i] > 100){
              m = m + v[i];
              } 
         }
         
         System.out.println("Possui "+cont+" produtos com preço abaixo de 50.");
         System.out.println("A média do preço dos produtos é "+m/5);
    }
    
}

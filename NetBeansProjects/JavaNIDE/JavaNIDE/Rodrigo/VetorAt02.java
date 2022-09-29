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
public class VetorAt02 {
    public static void main(String[] args) {
        
        Scanner teclado;
         teclado = new Scanner(System.in);
         int i;
         int cont = 0;
         int conti = 0;
         Integer v[] = new Integer [6];
         
         for (i = 0; i <= 5; i++){
             System.out.println("Digite o índice "+i+":");
             v[i] = teclado.nextInt();
             if (v[i] % 2 == 0){
                 System.out.println(v[i]+" é par");
             cont++;
             }
             else {
                 System.out.println(v[i]+" é impar");
             conti++;
             }
             }
         System.out.println("possui "+cont+" números pares");
         System.out.println("possui "+cont+" números impares");
         }
    }

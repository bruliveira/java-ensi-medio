/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.de.vetores;

import java.util.Scanner;

/**
 *
 * @author Turma 2017
 */
public class exer4 {
    public static void main(String[] args) {
   
    Integer v [] = new Integer [10];
    int i;
    int cont=0;
    int conti=0;
    int soma=0;
    int maior = 0;
    int menor = 1000000000;
    
    Scanner teclado;
    teclado = new Scanner ( System.in );
    
    System.out.println("Digite seus 10 valores desejados, por favor");
    for (i = 0 ; i <= 9 ; i ++){
        System.out.println("\nDigite um número:");
           v[i] = teclado.nextInt();
           
          if ( v[i] % 2 == 0 ){
                        System.out.println(v[i] + " é par");
                        cont = cont + v[i];
                    }else {
                        System.out.println( v[i] + " é impar");
                        conti = conti + v[i];
            }
         
          if ( v[i] > maior){
              maior = v[i];
          }else if (v[i] < menor){
              menor = v[i];
          }else {
              System.out.println("ERRO NOS VALORES");
          }
        soma = soma  + v[i];
    }
        System.out.println("\nA soma total é: "+ soma);
        System.out.println("A soma dos impares é: " + conti);
        System.out.println("O maior valor é: " + maior ); 
        System.out.println("O menor valor é: " + menor);
    }
    }


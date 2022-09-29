
package vetq04;

import javax.swing.JOptionPane;

public class Vetq04 {
    /* 4) Ler 10 valores e garantir que são maiores que zero. Ao final apresentar se os valores são ímpares ou não, mostrar a soma deles,
    a média aritmética, a soma dos pares, a soma dos ímpares, o maior e o menor valor.*/
public static void main(String[] args) {

   int y[] = new int [10];
   int p = 1;
   int sp = 0;
   int si = 0;
   int soma = 0;
   float media = 0;
   int maior = 0;
   int menor = 0;
     
  for(int o = 0;o <= 9;o++){
    y[o] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ p +"º valor: "));

 while(y[o] <= 0){
    y[o] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que seja maior que zero: "));
    }
 
 if(y[o] % 2 == 0){
    System.out.println("Par");
    sp += y[o];
 }
 
 if(y[o] % 2 != 0){
    System.out.println("Ímpar");
    si += y[o];
 }
 
 if(y[o] > maior){
    maior = y[o];
 }
 
 if(y[o] < menor){
    menor = y[o];
 }
    soma += y[o];
    p++;
 }
  
 media = soma / 10; 
 
System.out.println("");
System.out.println("- A soma deles é igual a "+ soma +" -");
System.out.println("- A media desse vetor é "+ media +" -");
System.out.println("- A soma dos pares é "+ sp +" -");
System.out.println("- A soma dos impares é "+ si +" -");
System.out.println("- O maior numero é "+ maior +" -");
System.out.println("- O menor numero é "+ menor +" -");
System.out.println("");

  }
    
}

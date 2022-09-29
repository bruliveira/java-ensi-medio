/*
 * Crie um vetor de 10 posições de inteiro, digite 10 valores
 * calcule e mostre a soma e a média.
 */
package aula7;
import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String args[]){
        //criar o vetor
        int numero[] = new int[10];
        double soma = 0;
        //preencher o vetor
        for(int x = 0; x < 10; x++){
            //converter String para int
            numero[x] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    "Digite um valord:"));
            soma += numero[x];           // acumulador
        }//for
        
        JOptionPane.showMessageDialog(null,
                "Soma = " + soma + "\n" +
                "Média = " + (soma/10) );
    }//main
}//class

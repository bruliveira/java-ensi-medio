/*
 * Preencha um vetor de 10 posições com números.
 * percorra o vetor para encontrar o maior valor.
 * Mostre qual é esse valor e em que posição ele está.
 */
package aula7;
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String args[]){
        int num[] = new int[10];
    
        for(int x = 0; x < 10; x++){
            //preenchimento com valores aleatórios
            num[x] = Math.round((float)Math.random()*100);
            //exibir os valores sorteados
            System.out.println("p" + x + " = " + num[x]);
        }//for
        
        int maior = num[0];
        int pos = 0;
        
        for(int x = 1; x < 10; x++){
            if(num[x] > maior){
                maior = num[x];
                pos = x;
            }//if
        }//for
        
        JOptionPane.showMessageDialog(null,
                "Maior = " + maior + "\n" +
                "Posição = " + pos);        
    }//main
}//class

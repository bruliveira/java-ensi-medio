/*
 * Crie um programa que solicite a digitação de 5 nomes
 * de pessoas, armazene em um vetor e a seguir exiba 
 * uma janela com todos os nomes.
*/
package aula7;
import javax.swing.JOptionPane;
public class Aula7b {
    public static void main(String[] args) {
        // declaração do vetor com 5 posições
        String nome[] = new String[5];
        // preenchimento
        String texto = "";
        for(int x = 0; x < 5; x++){
            nome[x] = JOptionPane.showInputDialog(
                    "Digite o nome " + x );
            texto += nome[x] + "\n";
        }//for
        //exibir nomes
        JOptionPane.showMessageDialog(null, texto);
    }//main
}
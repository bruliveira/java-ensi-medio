/*
 * Crie uma matriz para armazenar o PESO e a ALTURA
 * de 5 atletas. Calcule e mostre a média do peso e altura.
 */
package aula7;
import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String args[]){
        //criar a matriz
        double dados[][] = new double[2][5];
        double somap = 0, somaa = 0;
        for(int x = 0; x < 5; x++){
            dados[0][x] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                    "Digite o peso " + x));
            somap += dados[0][x];  // acumulador
            
            dados[1][x] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                    "Digite a altura " + x));
            somaa += dados[1][x];  // acumulador
        }//for
        JOptionPane.showMessageDialog(null,
                "Média dos pesos = " + (somap/5) + "\n" +
                "Média das alturas = " + (somaa/5));        
    }//main
}//class

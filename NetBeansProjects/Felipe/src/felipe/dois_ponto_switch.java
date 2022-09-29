/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felipe;

import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class dois_ponto_switch {
     public static void main(String[] args) {
    
    int n; 
    
    JOptionPane.showMessageDialog(null," Digite 1 se quiser entrar com um valor em BINÁRIO"
    + "\n" + " 2 se quiser entra com um valor em DÉCIMAL"
    + "\n" + " 3 se quiser entrar com um valor em HEXADÉCIMAL");
    
    n=Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente ao que você deseja:"));
    
         switch (n) {
             case 1:
                 String aux =JOptionPane.showInputDialog("Digite um número em binário");
                 int binarioDecimal = Integer.parseInt(aux, 2);
                 JOptionPane.showMessageDialog(null,"Número digitado em BINÁRIO: " + aux +
                         "\n" + aux + " em DECIMAL : " + binarioDecimal +
                         "\n" + aux + " em HEXADECIMAL : " + Integer.toHexString(binarioDecimal));
                 break;
             case 2:
                 int numDecimal = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número em decimal"));
                 JOptionPane.showMessageDialog(null,"Número digitado em DECIMAL : " + numDecimal +
                         "\n" + numDecimal + " em BINÁRIO : " + Integer.toBinaryString(numDecimal)+
                         "\n" + numDecimal + " em HEXADECIMAL : " + Integer.toHexString(numDecimal));
                 break;
             case 3:
                 int base = 16;
                 String hexa  =JOptionPane.showInputDialog(" Digite um número em hexadecimal");
                 int numEmQualquerBase =  Integer.parseInt( hexa ,base);
                 JOptionPane.showMessageDialog(null, "Número digitado em HEXADECIMAL : " + hexa +
                         "\n" +  hexa + " em DECIMAL : " + numEmQualquerBase +
                         "\n" +  hexa + " em BINÁRIO : " + Integer.toBinaryString( numEmQualquerBase));
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"ERRO, Por favor tente novamente com atenção");
                 break;
         }
     }
}

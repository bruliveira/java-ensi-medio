/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felipe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class dois_ponto_if {
        public static void main(String[] args) {
    
    int n; 
    int b;
    int d; 
    int h;
    Scanner entrada = new Scanner(System.in);
    
    /*JOptionPane.showMessageDialog(null," Digite 1 se quiser entrar com um valor em BINÁRIO"
    + "\n" + " 2 se quiser entra com um valor em DÉCIMAL"
    + "\n" + " 3 se quiser entrar com um valor em HEXADÉCIMAL");
    */
    
    n=Integer.parseInt(JOptionPane.showInputDialog(" Digite 1 se quiser entrar com um valor em BINÁRIO"
    + "\n" + " 2 se quiser entra com um valor em DÉCIMAL"
    + "\n" + " 3 se quiser entrar com um valor em HEXADÉCIMAL"
    + "\n" + "\n" +  "Digite o número correspondente ao que você deseja:"));
    

    if ( n == 1 ){
        String aux =JOptionPane.showInputDialog("Digite um número em binário"); 
        int binarioDecimal = Integer.parseInt(aux, 2);
        JOptionPane.showMessageDialog(null,"Número digitado em BINÁRIO: " + aux +
        "\n" + aux + " em DECIMAL : " + binarioDecimal +
        "\n" + aux + " em HEXADÉCIMAL : " + Integer.toHexString(binarioDecimal));  
    }else if ( n == 2 ){
        int numDecimal = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número em decimal"));
        JOptionPane.showMessageDialog(null,"Número digitado em DECIMAL : " + numDecimal + 
        "\n" + numDecimal + " em BINÁRIO : " + Integer.toBinaryString(numDecimal)+
        "\n" + numDecimal + " em HEXADÉCIMAL : " + Integer.toHexString(numDecimal));     
    }else if( n == 3 ){
        int base = 16;
        
        String hexa  =JOptionPane.showInputDialog(" Digite um número em hexadecimal");
        int numEmQualquerBase =  Integer.parseInt( hexa ,base);     
        JOptionPane.showMessageDialog(null, "Número digitado em HEXADÉCIMAL : " + hexa +
        "\n" +  hexa + " em DÉCIMAL : " + numEmQualquerBase + 
        "\n" +  hexa + " em BINÁRIO : " + Integer.toBinaryString( numEmQualquerBase));
    }else{
        JOptionPane.showMessageDialog(null,"ERRO, Por favor tente novamente com atenção");
    }
      
        }
}

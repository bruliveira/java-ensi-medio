/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruna;

import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class binarii {
    public static void main(String[] args){
    
    int decimal;
        int numero = 10;
    
    
    /* int d =numero;
        int b;
        while ( d > 1){
            b = d % 2;
            System.out.println ( b );
            d -= d / 2 ;
        }*/

        
    String n= JOptionPane.showInputDialog(null,"Digite um número Binário : ");
    decimal = Integer.parseInt(n, 2);//método que transforma String em inteiro, com base definida como 2
    JOptionPane.showMessageDialog(null,"Você digitou " + n + ", e seu referente decimal é: "+ decimal);
    
}
}

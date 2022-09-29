/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruna;

import java.util.Scanner;

/**
 *
 * @author bruna
 */
  
 
public class doisp1 {
	public static void main(String[] args) {
		
                Scanner entrada = new Scanner(System.in);
		
                /*System.out.print("Digite um número em decimal: ");
		int numDecimal = entrada.nextInt();//lê o número
		System.out.println("Valor em binário: " + Integer.toBinaryString(numDecimal));
		System.out.println("Valor em hex: " + Integer.toHexString(numDecimal));
		System.out.println("Valor em octal: " + Integer.toOctalString(numDecimal));
		*/
                
                System.out.println("Digite a base: ");
		int base = entrada.nextInt();//lê a base
                
		System.out.print("Digige o número na base escolhida: ");
		int numEmQualquerBase = Integer.parseInt(entrada.next(),base);
		System.out.println("Representação em decimal: " + numEmQualquerBase);
	}
}


    /*int base = 2;    
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número em BINÁRIO:"));
    int numEmQualquerBase = Integer.parseInt(entrada.next(),base);
    System.out.println("Representação em decimal: " + numEmQualquerBase);
    */
    

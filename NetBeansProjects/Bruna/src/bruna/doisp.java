/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruna;

/**
 *
 * @author bruna
 */
public class doisp {
     public static void main(String args[]) {
        //decimal - base 10
        int decimal = 150;
        
        //para binario - base 2
        String binario = Integer.toBinaryString(decimal);
        System.out.println(decimal+" em binario é: " + binario);
        
        //para hexadecimal - base 16
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(decimal+" em hexadecimal é: " + hexadecimal);
        
         //Binario para decimal
        int base_binaria = 2;
        int base_hexadecimal = 16;
        int bdecimal = Integer.parseInt(binario, base_binaria);//da base binaria
        System.out.println(binario + " em decimal é: " + bdecimal);
        int hdecimal = Integer.parseInt(hexadecimal, base_hexadecimal);
        System.out.println(hexadecimal + " em decimal é: " + hdecimal);
     }
}


import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma 2017
 */
public class fatorial {
    public static void main(String[] args) {
       
        int i; 
        int fat=1;
        int n;
   
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
  
        for ( i =1 ; i <= n ; i ++){
         fat = fat * i;
        }  JOptionPane.showMessageDialog(null, n + "! é: " +  fat);
    }
}


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruna
 */

public class teste {

  public static void main(String[] args) {
    String palavra = JOptionPane.showInputDialog("Digite uma palavra");
    for (int i = 1; i<palavra.length();i++){
        char letra = palavra.charAt(i);
        JOptionPane.showMessageDialog(null, "A " + i + " letra da palavra " + palavra + " é " + letra);
    }  
  }
}
   
    

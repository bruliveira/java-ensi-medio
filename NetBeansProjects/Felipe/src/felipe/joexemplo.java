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
public class joexemplo {
 
    public static void main(String[] args) {
    Object[] itens = { "MAÇA", "PERA", "BANANA" };
    Object selectedValue = JOptionPane.showInputDialog(null, 
    "Escolha um item" , "Opçao",
    
    JOptionPane.INFORMATION_MESSAGE, null,
    itens, itens [2]); 
    }
}

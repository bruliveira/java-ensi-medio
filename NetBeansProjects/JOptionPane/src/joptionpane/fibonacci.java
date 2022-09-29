/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bruna
 */
public class fibonacci {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int c;
        int i;
        int n;

        do {
            //String result = JOptionPane.showInputDialog("informe um numero entre 1 e 30!");
            //n = Integer.parseInt(result);
        
        n=Integer.parseInt(JOptionPane.showInputDialog("informe um numero entre 1 e 30!"));
        } while (n < 1 || n > 30);

        for (i = 1; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}

package bruna;

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 

//import java.util.Scanner;
import javax.swing.JOptionPane;


/*public class ante {
    public static void main(String[] args){
    int n;
    int a;
    Scanner teclado;
    teclado = new Scanner ( System.in);
    System.out.println("DIgite um número por favor");
    n=teclado.nextInt();    
    a = n - 1;
    System.out.println("o antecessor de " + n + " é: " + a);
    }
}*/
    public class ante {
        public static void main(String[] args){ 
        int n;
        int a;
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        a = n - 1;
        JOptionPane.showMessageDialog(null, "O antecessor de " + n + " é: " + a);
        }
    }


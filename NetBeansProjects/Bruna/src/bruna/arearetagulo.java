package bruna;
//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo

//import java.util.Scanner;
import javax.swing.JOptionPane;

/*public class arearetagulo {
    public static void main(String[] args){
    int b,a,adr;
    Scanner teclado;
    teclado = new Scanner ( System.in);
    System.out.println("Digite a base do retângulo");
    b=teclado.nextInt();    
    System.out.println("Digite a altura do retângulo");
    a=teclado.nextInt();    
    adr = b * a;
    System.out.println("A area do retângulo é: " + adr);
    }
}*/

public class arearetagulo {
    public static void main(String[] args){
    int b,a,adr;

    b=Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
    a=Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));
    adr = b * a;
    JOptionPane.showMessageDialog(null, "A area do retângulo é: " + adr);
}
}

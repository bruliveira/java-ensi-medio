
package pkgdo.pkgwhile;

import java.util.Scanner;


public class DoWhile {

  
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
            int i;
            System.out.print(" Digite um Numero Inicial ");
            i = teclado.nextInt();
System.out.print(" O NUMERO DIGITADO FOI " + i + "\n");
        do{
            i = i + 1;
            System.out.print(i +"\n");
              
        } while (i <100);
        }

    }
    



package vetor;

import java.util.Scanner;

public class VetorEx2 {
    
    public static void main(String[] args) {
        String v[] = new String [4];
        v[0] = "Primavera";
        v[1] = "Verão";
        v[2] = "Outono";
        v[3] = "Inverno";
        int i;
        Scanner teclado;
        teclado = new Scanner (System.in);
    System.out.println("As estações do ano são:"+v[0]+","+v[1]+","+v[2]+","+v[3]);
    for (i = 0; i <= 3; i++){
        System.out.println("Digite uma nova palavra para o indice "+i+":");
        v[i] = teclado.next();
    }
    System.out.println("As novas palavras digitadas são:");
    for (i = 0; i <= 3; i++){
        System.out.println(v[i]);
    }
    }
    
}

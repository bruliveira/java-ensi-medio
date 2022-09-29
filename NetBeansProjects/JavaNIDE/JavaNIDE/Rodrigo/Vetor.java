
package vetor;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
    Scanner teclado;
    teclado = new Scanner (System.in);
    int i;
    int s = 0;
    Integer v[] = new Integer [5];
    for (i = 0;i <= 4; i++){
        System.out.println("Digite o índice "+i+":");
    v[i] = teclado.nextInt();
    if (v[i] > 0 && v[i] % 2 == 0){
        System.out.println("O número "+v[i]+" que está no indice "+i+" é positivo e é par");
    }
    else if (v[i] > 0 && v[i] % 2 != 0 ){
        System.out.println("O número "+v[i]+" que está no indice "+i+" é positivo e é impar");
    }
    else if (v[i] < 0 && v[i] % 2 == 0){
        System.out.println("O número "+v[i]+" que está no indice "+i+" é negativo e é par");
    }
    else {
        System.out.println("O número "+v[i]+" que está no indice "+i+" é negativo e é impar");
    }
    s = s + v[i];
    }
        System.out.println("A soma dos valores é:"+s);
    }
    
}

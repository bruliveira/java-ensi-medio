/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruna;

public class m2 {
    public static void main(String[] args) {
        long primeiro = 1, segundo = 1, aux;
        for(int i = 0; i < 50; i++) {
            System.out.println(primeiro);
            aux = primeiro + segundo;
            primeiro = segundo;
            segundo = aux;
        }
    }
}
 

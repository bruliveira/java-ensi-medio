
package q12;

public class Q12 {

    /* 12) - Dado o vetor abaixo, crie um algoritmo em 
JAVA que ordene o vetor em ordem crescente e em
seguida em ordem decrescente.*/
    
    public static void main(String[] args) {
        Integer v[] ={5,1,4,2,7,8,3,6};
        int a;
        
            for (int i = 0; i < v.length;i++){
                for (int j = 0; j < (v.length - 1);j++){
                    if (v[j]> v[j + 1]){
                        a = v[j];
                        v [j] = v [j+1];
                        v [j+1] = a;
                    }
                }
            }
            System.out.println("Cresc:");
            for (int i = 0; i < v.length;i++){
                System.out.println("" + v[i]);
            }
            System.out.println("\n");
            for (int i = 0; i < v.length;i++){
                for (int j = 0; j < (v.length - 1);j++){
                    if (v[j]< v[j + 1]){
                        a = v[j];
                        v [j] = v [j+1];
                        v [j+1] = a;
                    }
                }
            }
            System.out.println("Decresc:");
            for (int i = 0; i < v.length;i++){
                System.out.println("" + v[i]);
            }
            System.out.println("\n");
 
    }
}

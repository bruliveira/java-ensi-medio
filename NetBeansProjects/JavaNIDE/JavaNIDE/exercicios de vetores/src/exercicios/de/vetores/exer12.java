package exercicios.de.vetores;

public class exer12 {

    public static void main(String[] args) {
        int i;
        int aux;
        int v[] = new int [8];
        
        v[0] = 5;
        v[1] = 1;
        v[2] = 4;
        v[3] = 2;
        v[4] = 7;
        v[5] = 8;
        v[6] = 3;
        v[7] = 6;
        
        for(i = 7; i >= 5; i--){
            aux = v[i];
            v[i] = v[7 - i + 1];
            v[7 - i + 1] = aux;
        }
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        
        for(i = 0; i < 8; i++) {
            System.out.println(i + " -> " + v[i]);
        }  
    }
}
    
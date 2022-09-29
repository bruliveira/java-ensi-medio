
package vetq11;

import javax.swing.JOptionPane;

public class Vetq11 {

    /*11) Ler dois vetores: R de 5 elementos e T de 10 elementos. Gerar um vetor X que possua os elementos comuns a R e T.
    Considere que no mesmo vetor não haverão números repetidos. Escrever o vetor X.*/
    
public static void main(String[] args) {

int x = 5;
int y = 10;
int z = 10;

double R[] = new double[x];
double T[] = new double[y];
double X[] = new double[z];

int i = 0;
int p = 0;
int k = 0;
int cont = 0;

for (i = 0; i < x; i++) {
   R[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero para o vetor R, posição " + (i) + ": "));
}

for (i = 0; i < y; i++) {
    T[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero para o vetor T, posição " + (i) + ": "));
        }

for (i = 0; i < x; i++) {
    
for (k = 0; k < y; k++) {
    
if (R[i] == T[k]) {
    cont++;
                }
            }
        }

for (i = 0; i < x; i++) {
    
for (k = 0; k < y; k++) {
    
if (R[i] == T[k]) {
    X[p] = T[k];
    p++;
                }
            }
        }
if (cont > 0) {
    System.out.print("ESSES NUMEROS SAO COMUNS NOS DOIS VETORES \n");
    
for (i = 0; i < cont; i++) {
    System.out.println(X[i]);
            }
        }
if (cont == 0) {
    JOptionPane.showMessageDialog(null, "ESSES NUMEROS NAO SAO COMUNS ENTRE OS VETORES");
        }
    }
}
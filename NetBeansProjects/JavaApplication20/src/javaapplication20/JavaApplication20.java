/*
4° Escreva um algoritmo que imprima a tabuada (de 1 a 10)
para os numeros de 1 a 10.
*/
package javaapplication20;

public class JavaApplication20 {

    public static void main(String[] args) {             
for (int i = 1; i<=10; i++){
System.out.println ("Tabuada do "+i+" [Multiplicação]");
for (int j = 1; j<=10; j++){
System.out.println (i+" X "+ j + " = " + (i*j));
                
                    }
                }     
                
for (double i = 1; i<=10; i++){
System.out.println ("Tabuada do "+i+" [Divisão]");
for (double j = 1; j<=10; j++){
System.out.println (i+" % "+ j + " = " + (i/j));
                    }
                }

for (int i = 1; i<=10; i++){
System.out.println ("Tabuada do "+i+" [Soma]");
for (int j = 1; j<=10; j++){
System.out.println (i+" + "+ j + " = " + (i+j));
                    }
                }
                
for (int i = 1; i<=10; i++){
System.out.println ("Tabuada do "+i+" [Subtração]");
for (int j = 1; j<=10; j++){
System.out.println (i+" - "+ j + " = " + (i-j));
                    }
                }
                
    }
}
    
    


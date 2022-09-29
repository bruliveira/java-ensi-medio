/*
5º)Crie os seguintes elementos
•Um vetor com 5 posições para armazenar o nome de 5 alunos.
•Um vetor também com 5 elementos para armazenar a nota da AV1 dos respectivos alunos. (Garanta que neste vetos só serão aceitos notas entre 0 e 10)
•Outro vetor também com 5 elementos para quadrar a nota da AV2 dos respectivos alunos. (Garanta que neste vetos só serão aceitos notas entre 0 e 10).
a)Apresente a média de cada um dos alunos em uma liste com o nome daqueles que ficaram, aprovados (média maior ou igual a 7), dos que ficaram em recuperação (média maior ou igual a 4 e inferior a 7) e dos que ficaram reprovados (média inferior a 4)
b)Identificar o nome do aluno com a melhor média e apresente a respectiva média .
c)Identificar o aluno com a pior média da turma e apresenta o seu nome e a respectiva média
d)Apresentar a média geral da turma
 */
package pkg5º.questão.matrizes;
import java.util.Scanner;
public class QuestãoMatrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        String nome [] = new String [5];
        int AV1 [] = new int [5];
        int AV2 [] = new int [5];
        int i = 0;
        String recebenome = null , recebenome1 = null;
        double media = 0,somav = 0, melhor = -1, pior = 11,mediageral = 0 ;
        for(i = 0;i < 5; i++){
            System.out.println("\n");
            System.out.println("Digite nome do aluno");
            nome [i] = teclado.next();
            System.out.println("Digite a nota da AV1 de " + nome[i]);
            AV1 [i] = teclado.nextInt();
            System.out.println("Digite a nota da AV2 de " + nome[i]);
            AV2 [i] = teclado.nextInt();
            
            while (AV1 [i] < 0 || AV1 [i] > 10){
                System.out.println("Só serão aceitas notas entre 0 e 10");
                System.out.println("Digite a nota da AV1 de " + nome[i] + " novamente");
                AV1 [i] = teclado.nextInt();
            }
            while (AV2 [i] < 0 || AV2 [i] > 10){
                System.out.println("Só serão aceitas notas entre 0 e 10");
                System.out.println("Digite a nota da AV1 de " + nome[i] + " novamente");
                AV2 [i] = teclado.nextInt();  
            }
            somav = AV1 [i] + AV2 [i];
            media = somav / 2;
            System.out.println("A média de "+nome[i]+" é: "+ media);
            if (media >= 7){
                System.out.println(nome[i]+" está Aprovado");
            }
            if (media < 7 && media >= 4){
                System.out.println(nome[i]+" está em Recuperação");
            }
            if (media < 4){
                System.out.println(nome[i]+" está Reprovado");
            }
            if (media > melhor){
                melhor = media;
                recebenome = nome [i];
            }
            if (media < pior){
                pior = media;
                recebenome1 = nome [i];
            }
            mediageral = mediageral + media;
        }
        mediageral = mediageral / 5;
        System.out.println("\n");
                System.out.println("Aluno com melhor média é "+recebenome+ " com "+melhor);
                System.out.println("Aluno com pior média é "+recebenome1+ " com "+pior);
                System.out.println("Média geral da turma é "+mediageral);
                System.out.println("\n");
                System.out.println("___________FIM DO PROGRAMA___________ ");
    }
    
}

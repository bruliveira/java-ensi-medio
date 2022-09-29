/**3° - Escreva um algoritmo para ler as notas da 1º e da 2º avaliações de um aluno, calcule e imprima a média aritmética 
     (média simples) desse aluno. O programa deve tratar para garantir que somente valores válidos sejam aceitos dentro do
     intervalo de (0 a 10) para cada nota. Ao termino imprima se o aluno foi aprovado, caso obtenha média maior ou igual que 7,
     recuperação, caso o aluno obtenha média entre 4 e 6,9 e reprovado, caso o aluno apresente média inferior a 4. Por fim,
     acrescente uma mensagem “NOVO CÁLCULO (S/N)?”. Se for respondido 'S' deve retornar e executar um novo cálculo,
     caso seja “N” deverá encerrar o algoritmo, caso não seja digitado nem “S” e nem “N”, informa que a mensagem,
     “Opção inválida!” e solicite novamente que o usuário escolha a de um novo calculo.**/
package javaapplication23;

import javax.swing.JOptionPane;

public class JavaApplication23 {

    public static void main(String[] args) {
        
double n1, n2,media;

        int op = 0, SN;
        String titulo;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Nota"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda Nota"));
        
        media = (n1 + n2) / 2;
        
        JOptionPane.showMessageDialog(null,"A sua média é " + media);
        
        if (media >= 7)
            JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
        
        if (media <= 4 || media <= 6.9)
            JOptionPane.showMessageDialog(null,"Aluno Em Recuperação!");
        
        if (media < 4 )
            JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
        
        SN=Integer.parseInt(JOptionPane.showInputDialog("Novo Calculo?? (1 p/ Sim) (2 p/ Não)"));
        
        switch (SN){
            
        case 1:
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        
        media = (n1 + n2) / 2;
        
        JOptionPane.showMessageDialog(null,"A sua média é " + media);
        
        if (media >= 7)
            JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
        
        if (media >= 4 || media < 7)
            JOptionPane.showMessageDialog(null,"Aluno Em Recuperação!");
        
        if (media < 4 )
            JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
    break;
    
        case 2:
    JOptionPane.showMessageDialog (null, "Fim do Calculo!");
    break;
    
         default:
    JOptionPane.showMessageDialog (null, "Opção Invalida!");
    SN=Integer.parseInt(JOptionPane.showInputDialog("Novo Calculo?? (1 p/ Sim) (2 p/Não)"));
    break;

    }
    
}
}
   

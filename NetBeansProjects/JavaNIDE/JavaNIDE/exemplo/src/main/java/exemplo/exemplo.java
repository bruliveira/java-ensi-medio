public class exemplo {
public static void main(String[] args) {
  
    int n;
      
    Scanner teclado;
    teclado = new Scanner ( System.in );    

    System.out.println("Digite um número");
    n = teclado.nextInt();
     
    if (n<0){
        System.out.println(n + " é negativo");
    }else if (n==0){
        System.out.println(n + " é zero");
    }else if(n>0){
        System.out.println(n + " é positivo");
    }else {
        System.out.println(n + " não indentificado");
    }
}
}

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro");
        int numI = entrada.nextInt();
        System.out.println("Informe um outro número inteiro");
        int numII = entrada.nextInt();
        System.out.println("Soma dos dois números: " + (numI + numII));

        entrada.close();
    }
}

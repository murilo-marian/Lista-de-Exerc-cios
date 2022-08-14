import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int x = entrada.nextInt();
        System.out.println("O numero informado foi " + x);

        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int impapar = entrada.nextInt();

        impapar = ++impapar;
        if (impapar % 2 == 0) {
            System.out.println("O número se tornou par");
        } else {
            System.out.println("O número se tornou ímpar");
        }
    }
}

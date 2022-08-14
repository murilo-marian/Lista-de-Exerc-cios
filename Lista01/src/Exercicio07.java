import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado");
        float lado = entrada.nextFloat();
        System.out.println("A área do quadrado é de: " + (lado * lado));
    }
}

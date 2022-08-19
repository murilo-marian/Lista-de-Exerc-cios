import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um ano");
        int ano = entrada.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("O ano é bissexto");
                }
            } else {
                System.out.println("O ano não é bissexto");
            }
        } else {
            System.out.println("Não é um ano bissexto");
        }
    }
}

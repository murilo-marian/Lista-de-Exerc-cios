import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextInt();
        float nota2 = entrada.nextInt();

        float media = (nota1 + nota2)/2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 3) {
            System.out.println("Em exame");
        } else {
            System.out.println("Reprovado");
        }
    }
}

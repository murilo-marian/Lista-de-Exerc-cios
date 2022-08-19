import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextInt();
        float nota2 = entrada.nextInt();

        float media = (nota1 + nota2)/2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media < 10 && media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
    }
}

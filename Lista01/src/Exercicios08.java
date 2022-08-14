import java.util.Scanner;

public class Exercicios08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário por hora: ");
        float sal = entrada.nextFloat();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        float horas = entrada.nextFloat();

        System.out.println("Seu salário bruto deste mês deve ser igual a: " + (sal * horas));

    }
}

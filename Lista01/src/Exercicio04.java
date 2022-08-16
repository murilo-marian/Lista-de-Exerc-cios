import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as 4 notas bimestrais");
        System.out.print("Nota 01: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Nota 02: ");
        float nota2 = entrada.nextFloat();
        System.out.print("Nota 03: ");
        float nota3 = entrada.nextFloat();
        System.out.print("Nota 04: ");
        float nota4 = entrada.nextFloat();

        System.out.println("A média é: " + ((nota1 + nota2 + nota3 + nota4) /4));

        entrada.close();
    }
}

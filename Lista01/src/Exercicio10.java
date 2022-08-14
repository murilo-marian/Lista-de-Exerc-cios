import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros e um real, nessa ordem: ");
        int inteiro1 = entrada.nextInt();
        int inteiro2 = entrada.nextInt();
        float flutuante = entrada.nextFloat();

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + ((Math.pow(inteiro1, 2)) * (inteiro2 / 2)));
        System.out.println("A soma do triplo do primeiro com o terceiro: " + ((inteiro1 * 3) + flutuante));
        System.out.println("O terceiro elevado ao cubo: " + Math.pow(flutuante, 3));
    }
}

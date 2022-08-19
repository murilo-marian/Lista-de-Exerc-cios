import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num = entrada.nextFloat();

        if (Math.ceil(num) == num) {
            System.out.println("Número inteiro");
        } else {
            System.out.println("Número Decimal");
        }
    }
}

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do círculo a ter sua área calculada: ");
        float raio = entrada.nextFloat();
        float area = (float) (Math.PI * Math.pow(raio, 2));
        System.out.printf("%.2f", area);

    }
}

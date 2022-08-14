import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os metros a serem convertidos para centímetros");
        float metros = entrada.nextFloat();
        System.out.println(metros + " são equivalentes a " + (metros*100) + " centímetros");
    }
}

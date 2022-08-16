import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        float tempFahrenheit = entrada.nextFloat();
        System.out.println("A temperatura equivalente em Celsius é: " + (5*((tempFahrenheit-32)/9)) );

        entrada.close();

    }
}

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura do sujeito: ");
        float altura = entrada.nextFloat();
        float pesoIdeal = (float) ((72.7*altura)-58);
        System.out.println("Seu peso ideal é: "+pesoIdeal);
    }
}

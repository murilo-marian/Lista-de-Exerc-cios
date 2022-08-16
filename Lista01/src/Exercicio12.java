import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura do sujeito: ");
        float altura = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Qual o seu sexo? (M/F)");
        String sexo = entrada.nextLine();

        float pesoIdeal;

        if (sexo.toLowerCase().equals("m")) {
            pesoIdeal = (float) ((72.7 * altura) - 58);
        } else {
            pesoIdeal = (float) ((62.1 * altura) - 44.7);
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);

        entrada.close();
    }
}

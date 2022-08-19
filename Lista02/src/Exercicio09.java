import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        float altura = entrada.nextFloat();
        entrada.nextLine();

        System.out.println("Qual o seu sexo? (M/F)");
        String sexo = entrada.nextLine();

        System.out.println("Qual o seu peso?");
        float peso = entrada.nextFloat();

        float pesoIdeal;

        if (sexo.toLowerCase().equals("m")) {
            pesoIdeal = (float) ((72.7 * altura) - 58);
        } else {
            pesoIdeal = (float) ((62.1 * altura) - 44.7);
        }
        System.out.println("Seu peso ideal é: " + pesoIdeal);
        if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal");
        } else if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal");
        } else {
            System.out.println("Você está dentro do peso ideal");
        }
        entrada.close();
    }
}

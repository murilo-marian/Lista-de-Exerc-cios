import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número");
        int num1 = entrada.nextInt();
        if (num1 > 0)  {
            System.out.println("O número é positivo");
        }
        else if (num1 < 0){
            System.out.println("O número é negativo");
        }
        else {
            System.out.println("O número é zero");
        }
    }
}

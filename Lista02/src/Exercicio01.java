import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva dois números");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        if (num1 > num2)  {
            System.out.println("O maior número é: " + num1);
        }
        else if (num2 > num1){
            System.out.println("O maior número é: " + num2);
        }
        else {
            System.out.println("Ambos os números são iguais");
        }
    }
}

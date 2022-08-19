import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextInt();
        float nota2 = entrada.nextInt();

        float media = (nota1 + nota2)/2;

        if (media >= 9) {
            System.out.println("A");
            System.out.println("Aprovado");
        } else if (media < 9 && media >= 7.5) {
            System.out.println("B");
            System.out.println("Aprovado");
        } else if (media < 7.5 && media >=6){
            System.out.println("C");
            System.out.println("Aprovado");
        } else if (media < 6 && media >= 4) {
            System.out.println("D");
            System.out.println("Reprovado");
        } else if (media < 4) {
            System.out.println("E");
            System.out.println("Reprovado");
        }
    }
}

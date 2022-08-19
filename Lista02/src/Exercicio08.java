import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextInt();
        float nota2 = entrada.nextInt();

        boolean passou = false;

        if ((nota1 + nota2)/ 2 >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

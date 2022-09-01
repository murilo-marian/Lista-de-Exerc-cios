import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        int comeco = entrada.nextInt();
        int fim = entrada.nextInt();
        int troca;

        if (comeco > fim) {
            troca = comeco;
            comeco = fim;
            fim = troca;
        }
        for (int i = comeco; i <= fim; i++) {
            System.out.println(num + " X " + i + " = " + (i * num));
        }
    }
}

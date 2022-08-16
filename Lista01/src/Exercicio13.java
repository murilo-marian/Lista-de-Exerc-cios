import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso da pesca: ");
        float pesca = entrada.nextFloat();
        float multa;

        if (pesca > 50) {
            pesca = pesca - 50;
            multa = pesca * 4;
            System.out.println("A pesca excedeu em " + pesca + " quilos, e o valor da multa é de " + multa + " reais");
        } else {
            System.out.println("Sem multas, menos de 50 quilos pescados");
        }

        entrada.close();
    }
}

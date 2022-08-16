import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados");
        float area = entrada.nextFloat();
        int latas = (int) Math.ceil((area / 54));

        System.out.println("Serão necessárias " + latas + " latas, que custarão R$" + (latas * 80));

        entrada.close();
    }
}

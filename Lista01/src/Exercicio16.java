import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o tamanho da área a ser pintada em metros quadrados");
        float area = entrada.nextFloat();
        int latas = (int) Math.ceil((area / 108));
        int galoes = (int) Math.ceil((area / 21.6));

        System.out.println("Comprando apenas latas de 18 litros, se devem comprar "+ latas +" latas");
        System.out.println("Comprando apenas galões de 3,6 litros, se devem comprar " + galoes +" galões");

        entrada.close();
    }
}
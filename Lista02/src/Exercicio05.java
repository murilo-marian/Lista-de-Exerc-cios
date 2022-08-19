import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra = entrada.nextLine().charAt(0);
        String comparado = Character.toString(letra);

        if ((comparado.equals("a")) || (comparado.equals("e")) || (comparado.equals("i")) || (comparado.equals("o")) || (comparado.equals("u"))) {
            System.out.println("A letra digitada é uma vogal");

        } else {
            System.out.println("A letra digitada não é uma vogal");
        }
    }
}

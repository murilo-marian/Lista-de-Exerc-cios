import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float custo = entrada.nextFloat();
        int codigo = entrada.nextInt();

        System.out.println("Preço: " + custo);
        if (codigo == 1) {
            System.out.println("Origem: Sul");
        } else if (codigo == 2) {
            System.out.println("Origem: Norte");
        } else if (codigo == 3) {
            System.out.println("Origem: Leste");
        } else if (codigo == 4) {
            System.out.println("Origem: Oeste");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Origem: Nordeste");
        } else if (codigo == 7 || codigo == 8) {
            System.out.println("Origem: Centro-Oeste");
        } else {
            System.out.println("Origem: Importado");
        }
    }
}

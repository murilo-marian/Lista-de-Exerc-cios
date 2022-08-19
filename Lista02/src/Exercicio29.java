import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String telefone = entrada.nextLine();
        System.out.println("Esteve no local do crime?");
        String local = entrada.nextLine();
        System.out.println("Mora perto da vítima?");
        String moradia = entrada.nextLine();
        System.out.println("Devia para a vítima?");
        String agiota = entrada.nextLine();
        System.out.println("Trabalhava com a vítima?");
        String trabalho = entrada.next();

        int contagem = 0;

        if (telefone.equals("y")) {
            ++contagem;
        }
        if (local.equals("y")) {
            ++contagem;
        }
        if (moradia.equals("y")) {
            ++contagem;
        }
        if (agiota.equals("y")) {
            ++contagem;
        }
        if (trabalho.equals("y")) {
            ++contagem;
        }

        if (contagem == 2) {
            System.out.println("suspeito");
        } else if (contagem == 3 || contagem == 4) {
            System.out.println("Cúmplice");
        } else if (contagem == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}

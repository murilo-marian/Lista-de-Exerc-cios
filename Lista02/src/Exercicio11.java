import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o turno em que estuda (M/V/N)");
        String turno = entrada.nextLine();

        if (turno.toLowerCase().equals("M")) {
            System.out.println("Bom dia");
        } else if (turno.toLowerCase().equals("V")) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}

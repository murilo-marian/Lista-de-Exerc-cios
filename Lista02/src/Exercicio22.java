import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int centenas;
        int dezenas;
        int unidades;
        if (numero < 1000) {
            centenas = numero / 100;
            dezenas = (numero - (centenas * 100)) / 10;
            unidades = (numero - (centenas * 100) - (dezenas * 10));
            System.out.println("Centenas: " + centenas + " Dezenas: " + dezenas + " Unidades: " + unidades);
        } else {
            System.out.println("Número maior ou igual a 1000");
        }
    }
}

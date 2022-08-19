import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a > b && b > c) {
            System.out.println(a +" "+ c);
        }
        else if (a > b && c > a) {
            System.out.println(c +" "+ b);
        }
        else if (b > a && c > b) {
            System.out.println(c +" "+ a);
        }
        else if (a > c && c > b ) {
            System.out.println(a +" "+ b);
        }
        else if (b > a && a > c) {
            System.out.println(b +" "+ c);
        }
        else if (b > c && c > b) {
            System.out.println(b +" "+ a);
        }
    }
}

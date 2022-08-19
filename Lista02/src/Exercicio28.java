import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        System.out.println("Qual operação deseja realizar? (soma/subtrair/dividir/multiplicar)");
        entrada.nextLine();
        String operacao = entrada.nextLine();

        float resultado;

        if (operacao.equals("soma")) {
            resultado = num1 + num2;
        } else if (operacao.equals("subtrair")) {
            resultado = num1 - num2;
        } else if (operacao.equals("dividir")) {
            resultado = num1/num2;
        } else {
            resultado = num1*num2;
        }

        System.out.println(resultado);

        if (resultado % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        if (resultado > 0) {
            System.out.println("Positivo");
        } else if (resultado < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        if (Math.ceil(resultado) == resultado) {
            System.out.println("Número Inteiro");
        } else {
            System.out.println("Número decimal");
        }
    }
}

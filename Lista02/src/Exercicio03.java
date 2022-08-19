import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva F ou M");
        String sexo = entrada.nextLine();
        if (sexo.toUpperCase() == "M")  {
            System.out.println("M - Masculino");
        }
        else if (sexo.toUpperCase() == "F"){
            System.out.println("F - Feminino");
        }
        else {
            System.out.println("Outro");
        }
    }
}

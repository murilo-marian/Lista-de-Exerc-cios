import java.util.Scanner;



public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float sal = entrada.nextInt();
        float reajusta;
        float percentual;
        if (sal <= 280) {
            percentual = 0.2f;
            reajusta = sal + (sal*percentual);
        } else if (sal < 700) {
            percentual = 0.15f;
            reajusta = sal + (sal*percentual);
        } else if (sal < 1500) {
            percentual = 0.1f;
            reajusta = sal + (sal*percentual);
        } else {
            percentual = 0.05f;
            reajusta = sal + (sal*percentual);
        }

        System.out.println("Salário anterior: " + sal);
        System.out.println("Porcentagem do reajuste: " + (percentual*100));
        System.out.println("Valor do aumento: " + (reajusta-sal));
        System.out.println("Novo salário: " + reajusta);
    }
}

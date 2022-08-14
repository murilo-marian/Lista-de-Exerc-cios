import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu salário por hora?");
        float sal = entrada.nextFloat();

        System.out.println("Quamtas horas foram trabalhadas neste mês?");
        float horas = entrada.nextFloat();

        float salBruto = (sal * horas);
        float ir = (float) (salBruto * 0.11);
        float inss = (float) (salBruto * 0.08);
        float sindicato = (float) (salBruto * 0.05);
        float salLiquido = (float) (salBruto - ir - inss - sindicato);

        System.out.println("O seu salário bruto é de: R$" + salBruto);
        System.out.println("O seu imposto de renda é de: R$"+ ir);
        System.out.println("O seu imposto para o INSS é de: R$" + inss);
        System.out.println("Você deve ao seu sindicato: R$" + sindicato);
        System.out.println("Seu salário líquido é de: R$" + salLiquido);


    }
}

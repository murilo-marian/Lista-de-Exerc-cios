import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dinheiro = entrada.nextInt();
        int cem;
        int cinquenta;
        int dez;
        int cinco;
        int um;

        if (dinheiro > 10 || dinheiro < 600) {
            cem = dinheiro /100;
            dinheiro = dinheiro - (cem*100);
            cinquenta = dinheiro / 50;
            dinheiro = dinheiro - (cinquenta*50);
            dez = dinheiro / 10;
            dinheiro = dinheiro - (dez*10);
            cinco = dinheiro/5;
            dinheiro = dinheiro - (cinco*5);
            um = dinheiro;
            System.out.println("Cem: " + cem + ", Cinquenta: " + cinquenta + ", Dez: " + dez + ", Cinco: " + cinco + ", Um: " + um);
        } else{
            System.out.println("Valor Inválido");
        }
    }
}

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int litro = entrada.nextInt();
        entrada.nextLine();
        String tipo = entrada.nextLine();

        float preco;
        float precoDescontado;

        if (tipo.equals("G")) {
            preco = (float) (litro*2.5);
            if (litro <= 20) {
                precoDescontado = (float) (preco - (preco*0.03));
            } else {
                precoDescontado = (float) (preco - (preco*0.05));
            }
        } else {
            preco = (float) (litro*1.9);
            if (litro <= 20) {
                precoDescontado = (float) (preco - (preco*0.04));
            } else {
                precoDescontado = (float) (preco - (preco*0.06));
            }
        }
        System.out.println(preco);
        System.out.println(precoDescontado);
    }
}

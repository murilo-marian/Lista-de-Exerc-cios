import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float aluno1 = entrada.nextInt();
        float aluno2 = entrada.nextInt();
        float aluno3 = entrada.nextInt();

        float media = (aluno1 + aluno2 + aluno3)/3;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media >= 25 && media < 40) {
            System.out.println("Turma Adulta");
        } else if (media >= 40) {
            System.out.println("Turma Idosa");
        }
    }
}

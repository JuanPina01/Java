package While;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ehBissexto) {
            System.out.println(ano + " � um ano bissexto.");
        } else {
            System.out.println(ano + " n�o � um ano bissexto.");
        }
    }
}

package For;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;
        System.out.println("A média é: " + media);
    }
}

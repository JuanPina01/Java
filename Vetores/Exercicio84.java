package Vetores;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
    }
}

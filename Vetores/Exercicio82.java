package Vetores;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos n�meros �: " + soma);
    }
}

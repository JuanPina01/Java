package Vetores;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 7;
        System.out.println("A m�dia aritm�tica �: " + media);
    }
}

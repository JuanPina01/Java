package Vetores;

import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
    }
}

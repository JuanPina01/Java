package Vetores;

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares entre 1 e " + numero + " é: " + soma);
    }
}

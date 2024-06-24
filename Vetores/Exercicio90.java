package Vetores;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números divisíveis por 3 e 5 entre 1 e " + numero + " é: " + soma);
    }
}

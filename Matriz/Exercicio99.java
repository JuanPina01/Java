package Matriz;

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                soma += i * i;
            }
        }

        System.out.println("A soma dos quadrados dos n�meros pares entre 1 e " + numero + " �: " + soma);
    }
}

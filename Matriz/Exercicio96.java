package Matriz;

import java.util.Scanner;

public class Exercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int produto = 1;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                produto *= i;
            }
        }

        System.out.println("O produto dos n�meros �mpares entre 1 e " + numero + " �: " + produto);
    }
}

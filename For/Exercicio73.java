package For;

import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: " + a + " " + b);
        for (int i = 2; ; i++) {
            int c = a + b;
            if (c > numero) break;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

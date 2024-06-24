package While;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        while (true) {
            c = a + b;
            if (c > numero) break;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

package DoWhile;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int divisor = 2;
        boolean ehPrimo = true;

        do {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        } while (divisor <= Math.sqrt(numero));

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

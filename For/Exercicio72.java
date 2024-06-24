package For;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

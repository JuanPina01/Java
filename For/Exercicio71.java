package For;

import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores de " + numero + ":");
        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}

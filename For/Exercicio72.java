package For;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }
    }
}

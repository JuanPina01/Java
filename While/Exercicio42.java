package While;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int divisor = 2;
        boolean ehPrimo = true;

        while (divisor <= Math.sqrt(numero)) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }
    }
}

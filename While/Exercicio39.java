package While;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de n�meros: ");
        int n = scanner.nextInt();

        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o n�mero " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / n;

        System.out.println("A m�dia �: " + media);
    }
}

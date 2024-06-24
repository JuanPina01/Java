package Matriz;

import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um n�mero inteiro (ou 0 para encerrar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A m�dia �: " + media);
        } else {
            System.out.println("Nenhum n�mero foi informado.");
        }
    }
}

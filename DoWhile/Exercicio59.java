package DoWhile;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double media = (double) somaIdades / 5;
        System.out.println("A m�dia das idades �: " + media);
    }
}

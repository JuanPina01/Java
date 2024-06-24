package While;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        while (contador < 5) {
            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
    }
}


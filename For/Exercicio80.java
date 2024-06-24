package For;

import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        for (;;) {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}

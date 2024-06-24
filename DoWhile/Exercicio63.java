package DoWhile;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);
        int i = 0;

        System.out.println("Dígitos do número:");
        do {
            System.out.println(numeroString.charAt(i));
            i++;
        } while (i < numeroString.length());
    }
}

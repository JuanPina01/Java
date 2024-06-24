package For;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);

        System.out.println("Dígitos do número:");
        for (int i = 0; i < numeroString.length(); i++) {
            System.out.println(numeroString.charAt(i));
        }
    }
}

package Vetores;

import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

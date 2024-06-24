package LogicaJava;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menores = 0;
        int maiores = 0;

        System.out.print("Digite o número de pessoas: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("Número de menores de idade: " + menores);
        System.out.println("Número de maiores de idade: " + maiores);
    }
}


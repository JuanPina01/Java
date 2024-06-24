package LogicaJava;

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas: ");
        int faltas = scanner.nextInt();

        if (faltas > 15) {
            System.out.println("Reprovado por faltas.");
        } else {
            System.out.println("Aprovado.");
        }
    }
}

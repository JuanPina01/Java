package Matriz;

import java.util.Scanner;

public class Exercicio108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] maiorLinha = new int[4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            maiorLinha[i] = Integer.MIN_VALUE;
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor presente em cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + i + ": " + maiorLinha[i]);
        }
    }
}

package Matriz;

import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / (4 * 4);
        System.out.println("A m�dia aritm�tica dos elementos �: " + media);
    }
}

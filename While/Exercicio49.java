package While;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + numero + " �: " + fatorial);
    }
}

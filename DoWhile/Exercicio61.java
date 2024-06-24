package DoWhile;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int i = 1;

        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= numero);

        System.out.println("A soma dos n�meros pares entre 1 e " + numero + " �: " + soma);
    }
}

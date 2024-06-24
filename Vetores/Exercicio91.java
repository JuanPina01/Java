package Vetores;

public class Exercicio91 {
    public static void main(String[] args) {
        int produto = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                produto *= i;
            }
        }

        System.out.println("O produto dos números pares entre 1 e 10 é: " + produto);
    }
}

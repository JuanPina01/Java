package Matriz;

public class Exercicio100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}

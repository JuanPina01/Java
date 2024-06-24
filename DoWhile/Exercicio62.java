package DoWhile;

public class Exercicio62 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Números ímpares de 1 a 50:");
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 50);
    }
}

package While;

public class Exercicio47 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("N�meros �mpares de 1 a 50:");
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

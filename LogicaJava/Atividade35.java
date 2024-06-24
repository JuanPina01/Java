package LogicaJava;

public class Atividade35 {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");

        for (int num = 2; num <= 100; num++) {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}

package LogicaJava;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int num2 = scanner.nextInt();

        int maior = (num1 > num2) ? num1 : num2;

        System.out.println("O maior n�mero �: " + maior);
    }
}

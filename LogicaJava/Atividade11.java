package LogicaJava;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro n�mero: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("M�dia aritm�tica: " + media);
    }
}

package LogicaJava;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " � m�ltiplo de " + num2);
        } else {
            System.out.println(num1 + " n�o � m�ltiplo de " + num2);
        }
    }
}


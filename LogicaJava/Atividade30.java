package LogicaJava;

import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco = (quantidade < 12) ? 1.30 : 1.00;
        double total = preco * quantidade;

        System.out.println("Valor total a ser pago: " + total);
    }
}

package LogicaJava;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal�rio atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.println("Novo sal�rio com aumento de 15%: " + novoSalario);
    }
}

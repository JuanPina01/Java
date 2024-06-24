package LogicaJava;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double aumento;
        if (salario <= 280) {
            aumento = salario * 0.20;
        } else if (salario <= 700) {
            aumento = salario * 0.15;
        } else if (salario <= 1500) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.05;
        }

        double novoSalario = salario + aumento;

        System.out.println("Aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);
    }
}

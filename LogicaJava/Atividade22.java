package LogicaJava;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salario = scanner.nextDouble();

        double bonus = (salario > 2000) ? salario * 0.10 : salario * 0.05;

        System.out.println("B�nus: " + bonus);
    }
}

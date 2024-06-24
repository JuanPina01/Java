package LogicaJava;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double impostoRenda = salarioBruto * 0.11;

        double salarioLiquido = salarioBruto - inss - sindicato - impostoRenda;

        System.out.println("Salário líquido: " + salarioLiquido);
    }
}

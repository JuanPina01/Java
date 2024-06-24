package LogicaJava;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}

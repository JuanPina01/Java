package LogicaJava;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        boolean podeAposentar = (sexo == 'M' && idade >= 65) || (sexo == 'F' && idade >= 60);

        if (podeAposentar) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
    }
}

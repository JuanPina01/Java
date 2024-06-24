package LogicaJava;

import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do m�s: ");
        String mes = scanner.next().toLowerCase();

        int dias;
        switch (mes) {
            case "janeiro":
            case "mar�o":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias = 29; // Ano bissexto
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = 0; // M�s inv�lido
                break;
        }

        if (dias == 0) {
            System.out.println("M�s inv�lido.");
        } else {
            System.out.println("O m�s de " + mes + " tem " + dias + " dias.");
        }
    }
}

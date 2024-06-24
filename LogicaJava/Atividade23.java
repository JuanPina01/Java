package LogicaJava;

import java.util.Scanner;

public class Atividade23 {
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
                dias = 28; // Para simplifica��o, n�o consideramos anos bissextos
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

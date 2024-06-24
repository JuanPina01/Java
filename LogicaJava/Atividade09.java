package LogicaJava;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		
		Scanner deposito = new Scanner(System.in);
		
		System.out.print("Digite o valor do depósito mensal: R$");
        double depositoMensal = deposito.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        double taxaJuros = deposito.nextDouble();

    
        int meses = 12;
        double montante = 0;
        for (int i = 1; i <= meses; i++) {
            montante += depositoMensal;
            montante *= (1 + taxaJuros);
        }

        System.out.println("Montante após 12 meses: R$" + montante);

	}

}

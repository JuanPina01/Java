package LogicaJava;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		  System.out.print("Digite o salário base do funcionário: ");
	        double salarioBase = salario.nextDouble();

	        // Calcula a comissão (5% do salário base) //
	        double comissao = 0.05 * salarioBase;

	        // Calcula o salário líquido (salário base + comissão) //
	        double salarioLiquido = salarioBase + comissao;

	        System.out.println("Salário líquido: R$" + salarioLiquido);

	}

}

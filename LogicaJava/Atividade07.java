package LogicaJava;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		  System.out.print("Digite o sal�rio base do funcion�rio: ");
	        double salarioBase = salario.nextDouble();

	        // Calcula a comiss�o (5% do sal�rio base) //
	        double comissao = 0.05 * salarioBase;

	        // Calcula o sal�rio l�quido (sal�rio base + comiss�o) //
	        double salarioLiquido = salarioBase + comissao;

	        System.out.println("Sal�rio l�quido: R$" + salarioLiquido);

	}

}

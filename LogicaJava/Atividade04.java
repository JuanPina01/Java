package LogicaJava;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota (de 0 a 10): ");
		double nota1 = nota.nextDouble();
		
		System.out.println("Digite a segunda nota (de 0 a 10): ");
		double nota2 = nota.nextDouble();
		
		System.out.println("Digite a terceira nota (de 0 a 10): ");
		double nota3 = nota.nextDouble();
		
		//Denindo as ponderadas//
		double ponderada1 = 2;
		double ponderada2 = 3;
		double ponderada3 = 5;
		
		//Calculo da média//
		double media = (nota1 * ponderada1 + nota2 * ponderada2 + nota3 * ponderada3) /
				(ponderada1 + ponderada2 + ponderada3);
		System.out.println("Média ponderada: " + media);
	}

}

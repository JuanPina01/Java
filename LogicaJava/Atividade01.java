package LogicaJava;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero1 = numero.nextInt();
		
		System.out.println("Digite um n�mero: ");
		int numero2 = numero.nextInt();
		
		//Caulculo da soma//
		int soma = numero1 + numero2;
		System.out.println("soma" + soma);
		
		//Calculo da subtra��o//
		int subtracao = numero1 - numero2;
		System.out.println("subtracao" + subtracao);
		
		//Calculo da multiplica��o//
		int multiplicacao = numero1 * numero2;
		System.out.println("multiplicacao" + multiplicacao);
		
		//Calculo da divis�o//
		int divisao = numero1 / numero2;
		System.out.println("divisao" + divisao);
	}

}

package LogicaJava;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner triangulo = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		double base = triangulo.nextDouble();
		
		System.out.println("Digite a altura do tri�ngulo: ");
		double altura = triangulo.nextDouble();
		
		//Calculo da �rea do triangulo//
		double area = (base * altura) /2;
		System.out.println("�rea do tri�ngulo: " + area);

	}

}

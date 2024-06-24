package LogicaJava;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		Scanner circulo = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = circulo.nextDouble();
		
		//Calculo da área//
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("Área do círculo: " + area);
		
		//Calculo do perimetro//
		double perimetro = 2 * Math.PI * raio;
		System.out.println("Perimetro do círculo: " + perimetro);
	}

}

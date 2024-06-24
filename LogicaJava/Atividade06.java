package LogicaJava;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
	
	     Scanner parouimpar = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = parouimpar.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }

	}

}

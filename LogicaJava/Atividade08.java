package LogicaJava;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
	       System.out.print("Digite o primeiro número: ");
	        int numero1 = numero.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = numero.nextInt();

	        // Troca os valores usando uma variável temporária //
	        int temp = numero1;
	        numero1 = numero2;
	        numero2 = temp;

	        System.out.println("Valores trocados:");
	        System.out.println("Primeiro número: " + numero1);
	        System.out.println("Segundo número: " + numero2);

	}

}

package LogicaJava;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner desc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double preco = desc.nextDouble();
		
		System.out.println("Digite a unidade de produtos: ");
		int unidade = desc.nextInt();
		
		double valorTotal;
		if(unidade >10) {
			valorTotal = preco * unidade * 0.9;
			
		}else {
			valorTotal = preco * unidade;
		}
		
		System.out.println("Valor total a ser pago: R$" + valorTotal);

	}

}

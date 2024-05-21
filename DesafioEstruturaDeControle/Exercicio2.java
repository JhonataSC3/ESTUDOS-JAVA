package DesafioEstruturaDeControle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do ano que voce deseja: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 00);
		
		if(bissexto == true) {
			System.out.println(ano + " é um ano bissexto!");
		}else {
			System.out.println(ano + " Não é um ano bissexto!");
		}
		entrada.close();
	}
}

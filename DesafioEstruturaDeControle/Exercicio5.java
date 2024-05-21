package DesafioEstruturaDeControle;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int contador = 0; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int numero = scanner.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
			
		}
		
		
		switch(contador) {
		case 0: 
			System.out.println(numero + " é primo!");
			break;
			
			default: 
				System.out.println(numero + "Não é primo!!");
				break;
		}
		scanner.close();
	}
}

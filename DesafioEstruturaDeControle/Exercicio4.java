package DesafioEstruturaDeControle;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de verificação: ");
		int numero = scanner.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		if(contador == 0){
			System.out.print(numero + " é Primo!");					
		}else {
			System.out.print(numero + " não é Primo!");			
		}
		scanner.close();
	}
}

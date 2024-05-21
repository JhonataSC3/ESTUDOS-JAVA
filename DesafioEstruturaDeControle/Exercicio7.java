package DesafioEstruturaDeControle;


import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somador = 0;
		int num = 0;
		
		while (num >= 0) {
			System.out.println("Digite um número inteiro ou negativo");
			num = scanner.nextInt();
		}if(num >= 0) {
			somador += num;
			System.out.printf("\nSoma até o número: %d\n", somador);
		}
		scanner.close();		
	}
	
	
	
	
	
	
	
	
	
	
	

}

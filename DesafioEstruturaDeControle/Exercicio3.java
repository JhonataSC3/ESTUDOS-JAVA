package DesafioEstruturaDeControle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o valor da primeira nota: ");		
		double nota1 = scanner.nextDouble();
		
		System.out.println("Escreva o valor da segunda nota");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.print("APROVADO!");
		}else if(media >= 4) {
			System.out.print("RECUPERAÇÃO");
		}else {
			System.out.print("REPROVADO");
		}
		scanner.close();
	}

}

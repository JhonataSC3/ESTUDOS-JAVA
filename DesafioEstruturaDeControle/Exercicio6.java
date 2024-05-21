package DesafioEstruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	
	Scanner scanner  =  new Scanner(System.in);	
	int next;
	int numero;
	int sorteado; 
	int tentativas;

	do {
		System.out.println("Sorteando numero...");
		Random aleatorio = new Random();
		
		sorteado = aleatorio.nextInt(101);
		
		System.out.println("Começo do jogo!");
		tentativas = 0;
		
		do {
			tentativas++;
			System.out.printf("Tentativa %d: ", tentativas);
			numero = scanner.nextInt();
			
			if(numero > sorteado){
				System.out.printf("O numero sorteado é menor que %d\n ", numero);
			} else if(numero < sorteado) {
				System.out.printf("O numero sorteado é maior que %d\n ", numero);
			} else {
				System.out.printf("PARABENS! Você acertou o numero em %d Tentativas!!", tentativas);
				break;
			}
		} while(tentativas != 10);
			System.out.printf("Digite 0 pra sair ou quaisquer numero pra continuar: ");
		next = scanner.nextInt();
	} while(next != 0); 
			scanner.close();
}
}

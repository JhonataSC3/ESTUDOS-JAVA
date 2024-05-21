package DesafioEstruturaDeControle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de um numero de 0 a 10: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0){
				System.out.print("Esse número " + numero + " é par!");
			}else {
				System.out.print("Esse número " + numero + " não é par!");
			}
		}else {
			System.out.print("Digite um valor válido!! ");
		}
		entrada.close();
	}
}

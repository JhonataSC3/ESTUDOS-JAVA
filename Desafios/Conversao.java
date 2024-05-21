package Desafios;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner salario =  new Scanner(System.in);

        System.out.print("Digite o seu salario do 1° mes: ");
        String mes1  = salario.nextLine().replace(",", ".");

        System.out.print("Digite o seu salario do 2° mes: ");
        String mes2  = salario.nextLine().replace(",", ".");

        System.out.print("Digite o seu salario do 3° mes: ");
        String mes3  = salario.nextLine().replace(",", ".");

        System.out.println(mes1 + mes2 + mes3);

        double valor1 = Double.parseDouble(mes1);
        double valor2 = Double.parseDouble(mes2); 
        double valor3 = Double.parseDouble(mes3);

        double media = ((valor1 + valor2 + valor3) / 3);

        System.out.printf("A sua media salarial é: " + media);

        salario.close();     
        
    }
    
}



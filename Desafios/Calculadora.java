package Desafios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // ler num1 
        // ler num2
        // ler + - * / %

        /* Scanner calculadora = new Scanner(System.in);
        System.out.print("Digite o segundo valor: ");
        float num1 = calculadora.nextInt();

        System.out.print("Digite o segundo valor: ");
        float num2 = calculadora.nextInt();

        System.out.print("Digite o operador: ");
        Integer operador = calculadora.nextInt();

        //double resultado; 
        //resultado = (num1) + (operador) + (num2);
        //System.out.print("RESULTADO: " + resultado);

        System.out.printf("Resultado: ",
        num1 + operador + num2);

        calculadora.close();
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double num1 = entrada.nextDouble();

        System.out.print("Insira o segundo valor: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String operador = entrada.next();

        // logica
        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f",
         num1, operador, num2, resultado);
        entrada.close();     

    }
    
}

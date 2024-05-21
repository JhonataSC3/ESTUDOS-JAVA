package Desafios;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {

        System.out.print("Digite o dia da semana que estamos: ");

        Scanner entrada = new Scanner(System.in);
        String DiaDaSemana = entrada.next();

        if ("domingo".equalsIgnoreCase(DiaDaSemana)) {
            System.out.println(1);
        }else if("Segunda".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(2);
        }else if("Terça".equalsIgnoreCase(DiaDaSemana) ||
                    "Terca".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(3);
        }else if("Quarta".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(4);
        }else if("Quinta".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(5);
        }else if("Sexta".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(6);
        }else if("Sábado".equalsIgnoreCase(DiaDaSemana) || 
                    "Sabado".equalsIgnoreCase(DiaDaSemana)){
            System.out.println(7);
        }else{
            System.out.println("Dia inválido!!!");
        }    

        entrada.close();
    }
    
}
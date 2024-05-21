package Desafios;

public class Aritmeticos {

    public static void main(String[] args) {
         double a = (6 * (3 + 2));
        double PotenciaA = Math.pow(a, 2) / (3 * 2);

        double b = ((1- 5) * (2 - 7)) / 2;
        double PotenciaB = Math.pow(b, 2);

        double PotenciaAB = (PotenciaA - PotenciaB);
        double ExpressoaA = (Math.pow(PotenciaAB, 3) / (Math.pow(10,3)));


        System.out.println(ExpressoaA);
        

        /* double NumA = Math.pow(6 * (3 + 2), 2);
        double DenA = 3 * 2;

        double NumB = (1 - 5) * (2 - 7);
        double DenB = 2;

        double SuperiorA = NumA / DenA;
        double SuperiorB = Math.pow(NumB / DenB, 2);

        double Superior = Math.pow(SuperiorA - SuperiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = Superior / inferior;

        System.out.print(resultado);
        */
    }
}
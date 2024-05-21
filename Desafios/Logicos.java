package Desafios;

public class Logicos {
    public static void main(String[] args) {
        // trabalho na terça (V ou F)
        // trabalho na quinta (V ou F)
        // caso os dois trabalhos derem certo irei comprar uma TV50 
        // se apenas um dos dois trabalhos derem certos irei comprar uma TV32
        // Se caso eu compre TV50 ou TV32 irei tomar sorvete com a familia
        // AND &&; OR ||; XOR ^; NOT !
        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean TV50 = (trabalho1 && trabalho2);
        boolean TV32 = (trabalho1 ^ trabalho2);
        boolean sorvete = (trabalho1 || trabalho2);
        
        // Operador Unário
        boolean saudavel = !sorvete; 
        System.out.println("\nComprou TV de 50 polegadas? " + TV50);
        System.out.println("\nComprou TV de 32 polegadas? " + TV32); 
        System.out.println("\nComprou TV de 32 polegadas e sorvete? " + sorvete);
        System.out.println("\nFicou em casa e mais saudavel? " + saudavel);                
        }
    
}

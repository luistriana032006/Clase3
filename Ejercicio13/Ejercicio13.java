package Ejercicio13;

import java.util.Scanner;


/**
 * Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números:
 * 1 para el mayor, 2 para el del medio y 3 para el menor.
Cuando llega la hora de la reunión, uno de los hermanos va tarde. 
Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
 * 
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int hermano2,hermano3;

         System.out.println( " que hermano falta "); 
        System.out.println( " digite los numeros ");
         hermano2 = entrada.nextInt();
         hermano3 = entrada.nextInt();
        
         int HermanosTarde = HermanoQueFalta(hermano2, hermano3);

          System.out.println( " el hermano que falta es "+ HermanosTarde);
         entrada.close();
    }

public static  int HermanoQueFalta (int h1, int h2) {

int sumatotal =  1 +  2 +3 ;
int faltante = h1+h2;

return sumatotal - faltante;
}

}

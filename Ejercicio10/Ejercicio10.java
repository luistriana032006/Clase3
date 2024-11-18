package Ejercicio10;

import java.util.Scanner;

/**
 * Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes 
 * (1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
Ejemplo:
Input : 12
Output : 31
A continuación encuentras la cantidad de días que tienen cada mes.

Mes	Días
1, 3, 5, 7, 8, 10 y 12	31
4, 6, 9, 11	30
2	28
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println( " dias de los meses del año ");
        
        int mes;

        Scanner entrada = new Scanner ( System.in);

         mes = entrada.nextInt();

        
         if ( mes ==1 || mes ==3 || mes == 7  || mes ==8 || mes ==10 || mes == 12) {
        
             System.out.println( " el mes "+ mes + " tiene 31 dias ");
        

        }

        else if ( mes == 4|| mes == 6 || mes == 9 || mes ==11 || mes == 30 ) {
        
         System.out.println( " el mes " + mes +  " tiene 30  dias " );
        }


        else {
        
         System.out.println(" el mes 2 tiene 28 dias ");
        }

         entrada.close();
    }
}

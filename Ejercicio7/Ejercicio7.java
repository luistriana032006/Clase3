package Ejercicio7;

import java.util.Scanner;

/**
 * Escriba un programa que permita ingresar tres números (representan la longitud de una línea)
 *  y compruebe si con estos números se puede formar un triángulo.
 * 
 *  REGLA DE DESIGUALDAD TRIANGULAR 
 * 
 * en cualquier triángulo, 
 * la suma de las longitudes de dos lados cualesquiera debe ser siempre mayor que la longitud del tercer lado
 */
public class Ejercicio7 {
    public static void main(String[] args) {

         Scanner entrada =  new Scanner( System.in);


        System.out.println( "  Contrucción de un triangulo "); 

        System.out.println( " introduce las tres longitudes");
         
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();        

          // COMPROBACION DE LAS DOS PRIMERAS LONGITUDES

        int SumaLongitudes;
 
        SumaLongitudes = numero1 + numero2;

        // Comprobacion triangulo 

        if ( SumaLongitudes> numero3) {
        
        System.out.println(" triangulo formado");
        
        }
 
        else { System.out.println(" triangulo no formado ");}

        entrada.close();

    }
}

package Ejercicio15;

import java.util.Scanner;

/***
 * Escriba un programa en el que ingrese un número y le diga si es positivo o negativo.
 *  Repita el proceso hasta que se ingrese el número cero
 * 
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);

        double numero;

        System.out.println( " digita un numero para saber si es positivo o negativo ");
 
       


        while ( true ) {
        
            numero = entrada.nextDouble();
            if ( numero==0) {
             System.out.println( " ERROR");
             break;
            }
        
            else if ( numero <0) {
            System.out.println( " el numero" + numero + " es negativo");
            }

            else if ( numero> 0 ) {
            
            System.out.println( " el numero "+numero+ " es positivo");
            }
            entrada.nextLine();
        }
        System.out.println( " datos no validos ");
            entrada.close();
    }
}

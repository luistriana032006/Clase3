package Ejercicio6;

import java.util.Scanner;

/**
 * Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.
 * 
 */


public class Ejercicio6 {
    public static void main(String[] args) {
        
        System.out.println(" numero divsibles por 2 y por 7 ");

        Scanner entrada = new Scanner (System.in);

         int numero;

         numero = entrada.nextInt();

        if ( numero %2 == 0 && numero %7==0) {
        
             System.out.println( " El numero "+ numero + " Es divisible por 2 y 7 ");
        }

        else {
    
            System.out.println(" el numero no es divisible por 2 ni por 7 ");
        }
    
    entrada.close();
    }
}

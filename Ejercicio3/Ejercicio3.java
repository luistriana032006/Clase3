 package Ejercicio3;

import java.util.Scanner;

/**
 * Escriba un programa que permita ingresar un número e identificar si es par o impar.
 * 
 */
 public class Ejercicio3 {
public static void main(String[] args) {
    System.out.println(" NUMERO PAR O IMPAR");

    Scanner entrada = new Scanner ( System.in);
     
    int numero;

    System.out.println( " digite un numero que este dentro de los reales ");
  
    numero= entrada.nextInt();

        if ( numero %2==0 ) {

            System.out.println( " El numero es par ");

        }

        else {
        
            System.out.println( " El numero es impar ");
        
        }
    entrada.close(); 

} 
    
}
package Ejercicio21;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que permita hacer la siguiente conversión:

Millas a kilómetros.
Kilómetros a millas.
Considera que

1 milla son 1.60934 kilómetros
1 kilómetro es 0.621371 millas
 * 
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
    System.out.println(" MILLAS A KILOMETROS Y KILOMETROS A MILLAS");
        System.out.println( " digita el numero 1 para millas a km el numero 2 para km a millas "); 

    double conversion,CantidadAConvertir,resultado;
    conversion = entrada.nextInt();
    
        System.out.println( " la cantidad que quieres convertir ");
        CantidadAConvertir = entrada.nextInt();
 
         // millas a kilometros // 
     if ( conversion==1) { 

         resultado = CantidadAConvertir *( 1.60934);

        System.out.println(" las millas "+ CantidadAConvertir + " se convirtieron a "+ resultado + " km");

    }

    else if ( conversion ==2 ) {
     resultado = CantidadAConvertir * ( 0.621371);
      System.out.println(" los kilometros " + CantidadAConvertir + " se convirtieron a "+ resultado + " millas ");
    
    }
 else {
 System.out.println( " datos no validos ");

}

entrada.close();


    }
}

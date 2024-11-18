package Ejercicio5;

import java.util.Scanner;

/**
 * Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.
 * 
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println( " es vocal o no es ??");
 
        Scanner entrada = new Scanner (System.in);
    // agarramos el dato de tipo char ( el charAt es para indicarle al programa que toque el valor cero que se ingrese )
        char letra = entrada.next().charAt(0);
  if (Character.isLetter(letra) ) {

    if ( letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
    System.out.println( " la letra que ingresas es "+ letra + " es vocal"); }

    else {
    
        System.out.println( " la letra "+ letra + " es un consonante ");
    }

  
    
 } else {
    System.out.println( " lo que ingreso es diferente a una letra  ");
    }

    entrada.close();
}


    }


package Ejercicio4;

import java.util.Scanner;

/**
 * 
 * Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println(" la letra es mayuscula o no ??" );
         Scanner entrada = new Scanner ( System.in);

         char letra;

         letra = entrada.next().charAt(0);


         
         if (Character.isUpperCase(letra)) {
            System.out.println("La letra " + letra + " es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra " + letra + " es minúscula.");

        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }


        entrada.close();
    }
}
package Ejercicio8;

import java.util.Scanner;

/****
 * Escriba un programa que permita ingresar un número (va a representar la cantidad de años) 
 * y de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla.

Años	Etapas
0 - 5	Primera infancia
6 - 11	Infancia
12 - 18	Adolescencia
19 - 26	Juventud
27 - 59	Adultez
> 59	Persona mayor
 * 
 * 
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(" edad ");
       Scanner entrada = new Scanner ( System.in);

       int edad;
        
       System.out.println(" ingrese su edad ");

    edad = entrada.nextInt();
    
   

    if ( edad >0 && edad<=5) {
    System.out.println(" usted es de primera infancia ");
    
   }
   else if ( edad >= 6 && edad <=11 ) {
    System.out.println(" ud es de la etapa de infancia ");
    
   }
   
   else if ( edad >=12 && edad <=18  ) {
   
    System.out.println(" usted es de la atepa de adolencia  "); 
    
   }

   else if ( edad >=19 && edad <=26) {
    
    System.out.println(" usted es de la etapa de juventud ");

   }

   else if ( edad >=27 && edad <=50 ) {
   
    System.out.println(" usted es de la etapa de adultez ");
    
   }

   else if ( edad >=51 && edad <100 ) {
    System.out.println(" usted es de la etapa de persona mayor ");


   }

   else { System.out.println(" datos no validos ");

 }


        entrada.close();

    }
}

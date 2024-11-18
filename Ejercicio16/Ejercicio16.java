package Ejercicio16;

import java.util.Scanner;

/**
 * Escriba un programa que permita ingresar un número mientras estos sean negativos.
 *  Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad de números negativos ingresados.
 * 
 * 
 */
public class Ejercicio16 {
 public static void main(String[] args) {
    System.out.println( " ingresa numeros negativos ");
    Scanner entrada = new Scanner ( System.in);

     int numero, contador=0;;

   
      while ( true ) {
         numero = entrada.nextInt();
          if ( numero<0) {
            System.out.println(" el numero es "+ numero + " es negativo " );
            contador++;
            
          }
          else {
            System.out.println("  numero no valido las veces  que se ingreso un numero negativo fue " + contador++);
            break; }
            }
            entrada.close();
   
           
         }
    }
   


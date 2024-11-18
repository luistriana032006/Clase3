package ejercicio2;

import java.util.Scanner;

/**
 * 
 *  Escriba un programa que le permita ingresar tres números e imprima en la consola 
 * el más grande de ellos.
 */
public class ejercicio2 {

    public static void main(String[] args) {
          System.out.println(" el numero mas grande ");

          Scanner entrada = new Scanner (System.in);
         // Pedimos los numeros //
           int numero1, numero2, numero3;
            System.out.println( " ingrese los numeros ");
            numero1= entrada.nextInt();
            numero2= entrada.nextInt();
            numero3= entrada.nextInt();

             // agaramos el valor de numero1 y se los asignamos a mayor para comprobar en los if 
            int mayor = numero1;

             /** si numero 2 es mayor que el numero 1 entonces el valor de la variable numero2 se lo 
              * asignamos a la variable
              * mayor 
              */
            if ( numero2> mayor) {
            
                mayor= numero2;
            
            }

             /** Si numero 3 es mayor que el numero 1 entonces el valor de la variable numero3 se los 
              * asigamos a la variable
              *  mayor 
              */
            if ( numero3> mayor){
            
                mayor = numero3;

            }
 
             /**
              * al cabo de que la variable mayor se le van asignando nuevos valores dentro de los if 
              entonces el ultimo valor que tiene la variable mayor es el que se muestra 
              *
              */
            System.out.println(" el numero mas grande es "+ mayor);
             
        entrada.close();
         
    }
}
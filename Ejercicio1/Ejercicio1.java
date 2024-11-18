
import java.util.Scanner;

/**
 * 
 *  Escriba un programa que permita ingresar un número real e identifique si el número es negativo, 
 * positivo o cero.
 * 
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
     System.out.println( " Numero negativo, positivo, o cero ");

        Scanner entrada = new Scanner ( System.in);
          
        int NumeroIngresado;

        System.out.println( " Digite el numero ");

      /** 
       *  while con una condicion verdadera ejecuta el programa hasta encontrar el condicional
       *  if que contiene el if [if ( con el codido adentro  )] 
       * 
       * */ 
        while ( true ) {
            
            // if que contiene todo el programa // 
              
             if (entrada.hasNextInt()) {
                NumeroIngresado = entrada.nextInt();
                 // pa cuando el numero es mayor a cero (0)

            if ( NumeroIngresado >0) {
        
                System.out.println( " el numero que ingreso "+ NumeroIngresado + " es positivo ");
               }
                // para cuando el numero es menor a cero (0)

               else if ( NumeroIngresado < 0 ) {
               
                System.out.println( " EL numero que ingreso "+ NumeroIngresado + " es negativo ");
               }
               // para cuando el numero es igual a cero (0)

               else if ( NumeroIngresado == 0) {
               
                System.out.println( " El numero que ingreso "+ NumeroIngresado+ " es cero");
                   
               }
               // para cuando es diferente a un entero

               else  {
                 System.out.println( " el dato ingresado es diferente a un entero ");
                
            

             }
            }
            // cierre del if que contiene las condiciones  a evaluar 

              else {
            System.out.println( " igrese solo un numero ");
            break;
             }

               entrada.nextLine(); // limpieza del buffer ( limpieza de entrada de los datos )
        }
        System.out.println( " cierre del programa ");
        entrada.close();

        }
        
       
    }

package Ejercicio14;

import java.util.Scanner;

/**
 * 
 * Realice un programa en el que ingrese un número y muestre el cubo. 
 * Repita el proceso hasta que se introduzca un valor negativo.
 * 
 */
public class Ejercicio14 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    System.out.println( " digite un numero y su potencia");

        double base, potencia;

    

          while ( true) {
            // pedimos los numeros de la base 
            System.out.println(" digite la base ");
          base= entrada.nextDouble();
          // si la base es negativa se cierra la pedida de datos y salimos del while 
            if ( base <0) {
                break;
            }
         /** si la base es mayor a cero entonces pedimos la potencia
          *  con la base ya almacenada y ejecutamos el math .pow*/ 
          System.out.println(" digite la potencia ");
          potencia = entrada.nextDouble();
          
                System.out.println(   " el resultado es "+Math.pow ( base,potencia )); 
                entrada.nextLine();
            }

            System.out.println( " ERROR");
        entrada.close();

       
    }
}

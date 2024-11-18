package Ejercicio12;

import java.util.Scanner;

/**
 En un día soleado y caluroso Sebastian y Adriana salen en busca de una sandia. 
 Se dirigen a la tienda más cercana y compran la más grande y jugosa.
En casa se disponen a dividir y a comer la fruta pero se les presenta un gran problema
 y es que Adriana y Sebastian son amante de los números pares. De manera que quieren dividir la sandía en dos 
 partes no necesariamente iguales pero ambas deben ser pares.
Escriba una función en el que pueda ingresar el peso de la sandía en kilogramos y la respuesta sea:

SI en caso de que se pueda dividir este peso en números pares
NO de lo contrario
 * 
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println( " digite el peso");

        int peso= entrada.nextInt();

        if (SePuedeDividir(peso)) {
        System.out.println(" si ");
        }

        else {
        
         System.out.println( " NO");
        }
         entrada.close();
    }
     public static boolean SePuedeDividir (int peso) {
    
        return peso >2 && peso %2 ==0;

    }
}

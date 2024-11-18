package Ejercicio11;

import java.util.Scanner;

/**
 * Escriba una función en la que pueda ingresar tres números enteros y diferentes. 
 * Imprima estos valores en orden ascendente.
Por ejemplo:
 * 
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
        
        System.out.println( " Digite los 3 numeros ");

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

      ordenareimprimir(numero1, numero2,numero3);

    entrada.close();
    }

    public static void  ordenareimprimir(int a,int b ,int c){
        
        int temp;

        if ( a > b) {

         temp =a ;
          a= b;
          b= temp;
        
        }

        if ( a>c ) {
        
        temp = a;
        a=c;
        c= temp;

        }
 
        if (b >c ){
        temp = b;
        b=c;
        c = temp;
        }

        System.out.println("Los números en orden ascendente son: " + a + ", " + b + ", " + c);

    }
}

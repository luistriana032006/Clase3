package Ejercicio17;
/***
 * 
Escriba un programa que escriba en pantalla los números del 1 al 100 de 5 en 5.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println( " numeros de 5 en 5 ");

        int numero;
        /** 
         * 
        inicializamos el bucle for en 5 su condicion es que el numero que se vaya haciendo en el incremento sea mayor 
        o igual a 100 y su incremento va hacer de 5 en 5 

        */
         for ( numero=0; numero<=100; numero+=5) {
        
            System.out.println(" numero "+ numero);
        }

         System.out.println( " ciclo concluido ");
    }
}

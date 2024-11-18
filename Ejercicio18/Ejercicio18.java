package Ejercicio18;


import java.util.Random;

/**
 * Escriba un programa que genere 120 números aleatorios entre -100 y 100. Imprime los siguientes cálculos:

Sumar los valores positivos.
Sumar los valores negativos.
Calcule la media de los números negativos.
Calcule la media de los números positivos.
Cuente la cantidad de ceros.
 * 
 */
public class Ejercicio18 {
    public static void main(String[] args) {
         // importamos clase ramdom en java 
         Random rand = new Random();

         int Sumapositivos = 0;
         int SumaNegativos = 0;
         int ContadorPositivos =0;
         int contadorNegativos =0;
         int ContadorCeros =0;

         for ( int i=0 ; i<120; i++) {
        
            int numero = rand.nextInt(200)-100;
           // clasificacion y acumulacion de numeros
            if (numero>0 ) {
             Sumapositivos += numero;
             ContadorPositivos ++;
            }

            else if ( numero <0 ) {
            SumaNegativos += numero;
            contadorNegativos++;
            }

            else {
            
                ContadorCeros++;

            }

            double mediapositivos = ContadorPositivos > 0 ? ( double ) Sumapositivos / ContadorPositivos : 0;
            double MediaNegativos = contadorNegativos > 0 ? ( double ) SumaNegativos / contadorNegativos : 0;

            System.out.println( " la suma de los positivos es "+ Sumapositivos);
            System.out.println( " la suma de negativos es" + SumaNegativos);
            System.out.println( " el conteo de ceros es "+ ContadorCeros);

            // medias 
            System.out.println( " la media de los positivos es "+ mediapositivos);
            System.out.println( " la media de los negativos es "+ MediaNegativos);












        }

        
    }
}

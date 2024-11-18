package Ejercicio9;

import java.util.Scanner;

/***
 * 
 * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren. 
 * La siguiente tabla muestra la información:

Unidades	Precio por unidad
[1 - 50]	$50.000
(50 - 100]	$45.000
(100 - 150]	$40.000
(150 - 200]	$35.000
> 200	$25.000
Escriba un programa que dado un número de camisas retorne el precio por unidad.
 * 
 * 
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        System.out.println( " tienda de camisetas ");
        // variables 

        // Pregunta tutoria como hacer que un dato double al momento del resultado me bote el numero con 3 decimales 



        double precio1=50.000, precio2= 45.000, precio3=40.000, precio4 = 35.000, precio5 = 25.000, resultado,PrecioPorUnidad;
        double NumeroCamisetas;
        Scanner entrada = new Scanner (System.in);

        
        System.out.println(" digite la cantidad de camisetas ");

        NumeroCamisetas = entrada.nextInt();

        if ( NumeroCamisetas >1 && NumeroCamisetas <=50) {
        
            
            resultado = NumeroCamisetas * precio1;
             System.out.println( " total a pagar es "+ resultado);
        
             PrecioPorUnidad = resultado / NumeroCamisetas;

             System.out.println( " el precio por unidad es "+ PrecioPorUnidad);
        }

        else if ( NumeroCamisetas > 51 && NumeroCamisetas <=100) {
        
            resultado = NumeroCamisetas * precio2;
             System.out.println( " total a pagar es "+resultado);

             PrecioPorUnidad = resultado /  NumeroCamisetas;
             System.out.println(" el precio por unidad es "+ PrecioPorUnidad);
        
        }

        else if ( NumeroCamisetas >101 && NumeroCamisetas <=150) {
        
         resultado = NumeroCamisetas * precio3;
         System.out.println( " total a pagar es " + resultado);

         PrecioPorUnidad = resultado /  NumeroCamisetas;
         System.out.println( " el precio por unidad es "+ PrecioPorUnidad);
        } 

        else if ( NumeroCamisetas >150 && NumeroCamisetas <=200){
         
            resultado = NumeroCamisetas * precio4;
            System.out.println( " total a pagar es "+ resultado);

            PrecioPorUnidad = resultado /  NumeroCamisetas;
            System.out.println( " el precio por unidad es " + PrecioPorUnidad);
        
        }

    
        else {
        
         resultado = NumeroCamisetas * precio5;
         System.out.println(" total a pagar es "+ resultado); 
         PrecioPorUnidad = resultado /  NumeroCamisetas;

         System.out.println( " el precio por unidad es "+ PrecioPorUnidad);
        }


        entrada.close();

    }

}

package Ejercicio23;
/**
 * 
 */
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un tamaño impar positivo para el diamante:"); 
    int tamano = entrada.nextInt(); 

    if (tamano <= 0 || tamano % 2 == 0) 
    
    { System.out.println("El tamaño debe ser un número entero positivo impar."); } 
    
    else { 
        imprimirDiamante(tamano); 
    } 
    
    entrada.close(); 
}
    

    public static void imprimirDiamante(int tamano) {

    int mitad = tamano /2; 
        
        //Parte superior del diamante for
        
         for (int i = 0; i <= mitad; i++) { 

       for  (int j = 0; j < mitad - i; j++) 

            { System.out.print(" "); 
        } 
            for (int j = 0; j < 2 * i + 1; j++) 
            { 
                System.out.print("*"); } System.out.println();
            } //Parte inferior del diamante 
            
            
            for (int i = mitad - 1; i >= 0; i--) 
            
            { 
                for (int j = 0; j < mitad - i; j++) 
                
                { System.out.print(" "); } 
                for (int j = 0; j < 2 * i + 1; j++) { System.out.print("*"); }
                
                
                System.out.println(); 
            
            } 
        }
}

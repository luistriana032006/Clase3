package Ejercicio19;

import java.util.Scanner;

/**
 * La sucesión de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21...
Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula como la suma de los dos inmediatamente anteriores.
Crea un programa reciba un número (N) del usuario y muestre los primeros N números de sucesión.
 * 
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
        System.out.println("Ingrese un número para mostrar los primeros N números de la sucesión de Fibonacci:");
         int N = entrada.nextInt();
        
        if (N <= 0) {
             System.out.println("Por favor, ingrese un número positivo."); 
    } 
        
        
        else { 
            
            System.out.println("Los primeros " + N + " números de la sucesión de Fibonacci son:"); 
        
        }
        int a = 0, b = 1, c;
        
        for (int i = 1; i <= N; i++) {
        System.out.print(a + " ");
        c = a + b; a = b; b = c; 
    }
        entrada.close();
}
} 
    
    
    
    



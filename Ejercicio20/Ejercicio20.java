package Ejercicio20;
/**
 * Realice un programa que genere el tablero de ajedrez en consola usando instrucciones de repetición.

| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
 * 
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println( " Tablero de ajedrez ");

            
        int filas =8 ,columnas =8;

        for (int i = 0; i < filas; i++) {
        
            for (int j = 0; j < columnas; j++) {
            
                if ((i + j) % 2 == 0) { 
                    System.out.print("B "); 
                }
                
                else { System.out.print("N "); }
            }
        
            System.out.println();
        }
        
    }

}

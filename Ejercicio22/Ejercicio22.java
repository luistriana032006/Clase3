package Ejercicio22;

import java.util.Scanner;

/**
 * Realizar un programa que permita controlar
 *  el juego de piedra, papel, tijera introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. 
Al final de cada ronda preguntar si desea volver a jugar.
 * 
 */
public class Ejercicio22 {
    public static void main(String[] args) { 

      Scanner entrada = new Scanner(System.in); 
        String jugador1, jugador2; 
        String respuesta;
      do { // Leer las elecciones de los jugadores 
        
        
        System.out.println("Jugador 1 - Introduzca P para piedra, L para papel y T para tijera:"); 
        jugador1 = entrada.nextLine().toUpperCase();

        System.out.println("Jugador 2 - Introduzca P para piedra, L para papel y T para tijera:"); 
        jugador2 = entrada.nextLine().toUpperCase(); 

        // Determinar el ganador 
         String resultado = determinarGanador(jugador1, jugador2); System.out.println(resultado); 
         
         //Preguntar si desean jugar otra vez
         System.out.println("¿Desean jugar otra vez? (S/N):"); 
         respuesta = entrada.nextLine().toUpperCase();

      } 

      while (respuesta.equals("S")); 
      entrada.close();
    }
  

  public static String determinarGanador ( String jugador1 ,String jugador2 ) {
  
  if ( jugador1.equals(jugador2 )) {
  
    return " empate";
  }
  switch (jugador1) {
    case "P": 
      return ( jugador2.equals(jugador1)) ? "Jugador 1 gana (Piedra aplasta a Tijera)." : "Jugador 2 gana (Papel envuelve a Piedra).";
    
    case "L": 
    return (jugador2.equals("P")) ? "Jugador 1 gana (Papel envuelve a Piedra)." : "Jugador 2 gana (Tijera corta a Papel).";  
   
    case "T": 
    return (jugador2.equals("L")) ? "Jugador 1 gana (Tijera corta a Papel)." : "Jugador 2 gana (Piedra aplasta a Tijera).";
    
    default:
    return " entrada no valida";
  }
  }
}

// package SieteYMedia;

/**
 * Clase Main JuegoSieteYMedia para el juego de las Siete y Media
 * @author Elías Robles
 * @author Luis Godino
 */

public class JuegoSieteYMedia {
  public static void main(String[] args) {
    Baraja baraja = new Baraja();
    Jugador jugador = new Jugador();
    Crupier crupier = new Crupier(baraja);
    boolean continuar = true; // Variable para controlar si el jugador desea continuar jugando
    int saldo;

    System.out.println("Buenas, es un placer conocerle");
    System.out.println("Puede decirme su nombre?");
    String nombre = System.console().readLine();
    System.out.println();
    jugador.setNombre(nombre);

    System.out.println("Vamos a jugar al juego de las siete y media");
    System.out.println();
    System.out.print("Para ello introduce el saldo incial: ");
    do { //Para controlar que el numero de la apuesta no sea negativo
      saldo = Integer.parseInt(System.console().readLine());
      if (saldo <= 0) {
        System.out.println("No puede introducir un número negativo");
        System.out.println("Vuelve a introducir un valor para el saldo: ");
      }
    } while ((saldo <= 0) );
    System.out.println();
    jugador.setSaldo(saldo);
    System.out.println("Encantado "+ jugador.getNombre()+ ", empieza con "+jugador.getSaldo()+" euros");

    baraja.barajarCartas();

    do {
      System.out.println("Cuanto quieres apostar?");
      double cantidadApostar = Double.parseDouble(System.console().readLine());
      System.out.println();
      // Reiniciar el valor de la mano y la mano de cartas antes de cada ronda
      jugador.resetearMano();
      crupier.resetearMano();

      boolean continuarRonda = true;
      while (continuarRonda) {
        jugador.agarrarCarta();
        System.out.println("Ha sacado un " + Jugador.manoCartas[jugador.posMano - 1].toString()); // Mostrar la última carta sacada
        System.out.println("Valor de la mano del jugador: " + jugador.getValorMano()); // Y esto saca el valor de la mano del jugador
        System.out.println();
        // Pedir carta o plantarse
        if (jugador.getValorMano() < 7.5) {
          System.out.println("¿Quieres pedir otra carta? (s/n)");
          String respuesta = System.console().readLine();
          System.out.println();
          if (respuesta.equalsIgnoreCase("n")) {
            continuarRonda = false; // Terminar la ronda si el jugador se planta
          }
        } else {
          continuarRonda = false; // Terminar la ronda si el jugador supera los 7.5 puntos
        }
      }
      // Turno del crupier
      crupier.jugar(jugador);
      

      // Determinar resultado de la ronda
      if (jugador.getValorMano() > 7.5 && crupier.getValorMano() <= 7.5) {
        System.out.println("¡El jugador ha perdido la ronda!");
        jugador.apostar(-cantidadApostar);
      } else if (crupier.getValorMano() > 7.5 && jugador.getValorMano() <= 7.5 ) {
        System.out.println("¡El jugador ha ganado la ronda!");
        jugador.apostar(cantidadApostar);
      } else {
        System.out.println("¡El jugador ha empatado con el crupier!");
      }

      // Mostrar saldo actual del jugador
      System.out.println("Saldo actual del jugador: " + jugador.getSaldo());
      System.out.println();
      
      // Preguntar al jugador si desea continuar jugando
      System.out.println("¿Quieres continuar jugando? (s/n)");
      String respuesta = System.console().readLine();
      continuar = respuesta.equalsIgnoreCase("s");

    } while (continuar);
  }
}

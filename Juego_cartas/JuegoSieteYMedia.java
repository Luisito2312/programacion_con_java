public class JuegoSieteYMedia {
  public static void main(String[] args) {
    Jugador jugador = new Jugador();
    Baraja baraja = new Baraja();
    boolean continuar = true; // Variable para controlar si el jugador desea continuar jugando
    double cantidadApostar=0;
    int saldo;

    System.out.println("Buenas, es un placer conocerle");
    System.out.println("Puede decirme su nombre?");
    String nombre = System.console().readLine();
    jugador.setNombre(nombre);

    System.out.println("Vamos a jugar al juego de las siete y media");
    System.out.print("Para ello introduce el saldo incial: ");
    do {
      saldo = Integer.parseInt(System.console().readLine());
      if (saldo <= 0) {
        System.out.println("No puede introducir un número negativo");
        System.out.println("Vuelve a introducir un valor para el saldo: ");
      }
    } while ((saldo <= 0) );
    
    jugador.setSaldo(saldo);
    System.out.println("Encantado "+ jugador.getNombre()+ ", empieza con "+jugador.getSaldo()+" euros");

    baraja.barajarCartas();

    do {
      System.out.println("Cuanto quieres apostar?");
      cantidadApostar = Double.parseDouble(System.console().readLine());

      // Reiniciar el valor de la mano y la mano de cartas antes de cada ronda
      jugador.resetearMano();

      boolean continuarRonda = true;
      while (continuarRonda) {
        jugador.agarrarCarta();
        System.out.println("Ha sacado un " + Jugador.manoCartas[jugador.posMano - 1].toString()); // Mostrar la última carta sacada
        System.out.println("Valor de la mano: " + jugador.getValorMano());

        // Pedir carta o plantarse
        if (jugador.getValorMano() < 7.5) {
          System.out.println("¿Quieres pedir otra carta? (s/n)");
          String respuesta = System.console().readLine();
          if (respuesta.equalsIgnoreCase("n")) {
            continuarRonda = false; // Terminar la ronda si el jugador se planta
          }
        } else {
          continuarRonda = false; // Terminar la ronda si el jugador supera los 7.5 puntos
        }
      }

      // Determinar si el jugador gana o pierde la ronda
      if (jugador.getValorMano() <= 7.5) {
        System.out.println("¡Has ganado la ronda!");
        jugador.apostar(cantidadApostar);
      } else {
        System.out.println("¡Has perdido la ronda!");
        jugador.apostar(-cantidadApostar);
      }

      // Mostrar saldo actual del jugador
      System.out.println("Saldo actual: " + jugador.getSaldo());

      // Preguntar al jugador si desea continuar jugando
      System.out.println("¿Quieres continuar jugando? (s/n)");
      String respuesta = System.console().readLine();
      continuar = respuesta.equalsIgnoreCase("s");

    } while (continuar);
  }
}

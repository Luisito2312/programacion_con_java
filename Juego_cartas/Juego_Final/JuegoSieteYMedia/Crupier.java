// package SieteYMedia;

/**
 * Clase Crupier para el juego de las Siete y Media
 * @author Elías Robles
 * @author Luis Godino
 */

public class Crupier extends Jugador{
  private Baraja baraja;

  public Crupier(Baraja baraja) {
      this.baraja = baraja;
  }

  public void jugar(Jugador jugador) {
    resetearMano(); // Reiniciar la mano del crupier antes de empezar

    while (getValorMano() < 7.5) {
        agarrarCarta(); // El crupier toma cartas mientras su mano sea menor a 7.5
        System.out.println("El Crupier ha sacado un " + Crupier.manoCartas[posMano - 1].toString());
        System.out.println("Valor de la mano del crupier: " + getValorMano());
        System.out.println();
    }
}

}

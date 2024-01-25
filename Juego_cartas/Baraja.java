// package SieteYMedia;

/**
 * Clase Baraja para el juego de las Siete y Media
 * @author Elías Robles
 */

public class Baraja {

  // Atributos
  private Carta[] cartas;
  private int posCartas;

  // Constructor
  public Baraja() {
    this.posCartas = 0;
    this.cartas = Carta.inicializarCartas();
  }

  // Método para barajar las cartas
  public void barajarCartas() {
    int posAleatoria;
    Carta carta;

    for (int i = 0; i < cartas.length; i++) {
      posAleatoria = (int) (Math.random() * 40);

      carta = cartas[i];
      cartas[i] = cartas[posAleatoria];
      cartas[posAleatoria] = carta;
    }
  }

  // Método para obtener las cartas
  public Carta[] getCartas() {
    return cartas;
  }

  // Método para resetear la baraja
  public void resetearBaraja() {
    this.cartas = Carta.inicializarCartas();
    this.posCartas = 0;
  }

  public static void main(String[] args) {
    Baraja baraja = new Baraja();
    baraja.barajarCartas();

    // Mostrar cartas barajadas
    for (int i = 0; i < 40; i++) {
      System.out.println(baraja.getCartas()[i].getValores());
    }

    // Resetear la baraja
    baraja.resetearBaraja();

    // Mostrar cartas después de resetear
    System.out.println("\nBaraja después de resetear:\n");
    for (int i = 0; i < 40; i++) {
      System.out.println(baraja.getCartas()[i].getValores());
    }
  }
}

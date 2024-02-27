// package SieteYMedia;

/**
 * Clase Baraja para el juego de las Siete y Media
 * @author Elías Robles
 */

public class Baraja {

  // Atributos
  public static Carta[] cartas;
  public static int posCartas;
  public int length = 40;

  // Constructor
  public Baraja() {
    Baraja.posCartas = 0;
    Baraja.cartas = Carta.inicializarCartas();
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
    posCartas = 0;
  }

  // Método para sacar una carta de la baraja
  // Índice 0 sacas carta
  public static Carta sacarCarta() {
    if (posCartas < cartas.length) {
      Carta carta = cartas[posCartas];
      posCartas++;
      return carta;
    } else {
      System.out.println("No hay más cartas en la baraja.");
      return null;
    }
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

    // Sacar una carta
    System.out.println("\nCarta sacada de la baraja:\n");
    Carta cartaSacada = Baraja.sacarCarta();
    if (cartaSacada != null) {
      System.out.println(cartaSacada.getValores());
    }
  }
}

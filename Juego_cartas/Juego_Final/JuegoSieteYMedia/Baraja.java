// package SieteYMedia;

/**
 * Clase Baraja para el juego de las Siete y Media
 * @author Elías Robles
 * @author Luis Godino
 */

public class Baraja {

  // Atributos
  protected static Carta[] cartas;
  protected static int posCartas;
  protected static int length = 40;

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
      posAleatoria = (int) (Math.random() * length);

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
    Baraja.cartas = Carta.inicializarCartas();
    Baraja.posCartas = 0;
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
}

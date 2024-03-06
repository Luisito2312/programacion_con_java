// package SieteYMedia;

/**
 * Clase Jugador para el juego de las Siete y Media
 * @author Elías Robles
 * @author Luis Godino
 */

public class Jugador {
  private double saldo;
  private double apuestaActual;
  protected static Carta[] manoCartas;
  protected int posMano;
  private double valorMano;
  private String nombre;

  // Constructor de Jugador
  public Jugador() {
      this.saldo = 0.0;
      this.apuestaActual = 0.0;
      Jugador.manoCartas = new Carta[15]; // Máximo de 10 cartas en la mano
      this.valorMano = 0.0;
      this.posMano = 0;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
     this.nombre = nombre;
  }

  public void agarrarCarta() {
    Carta cartaActual = Baraja.sacarCarta();
    manoCartas[posMano] = cartaActual;
    posMano++;
    valorMano += cartaActual.getValor(); // Sumar el valor de la nueva carta a la mano
  }


  // Getter para ver el saldo actual
  public double getSaldo(){ 
    return this.saldo;
  }

  // Getter apuesta en esta ronda
  public double getApuestaRonda(){
    return this.apuestaActual;
  }

  // Setter saldo
  public void setSaldo(double s) {
    this.saldo = s; 
  }

  public void resetearMano() {
    this.valorMano = 0.0;
    this.posMano = 0;
    for (int i = 0; i < manoCartas.length; i++) {
      manoCartas[i] = null;
    }
  }

  public void valorMano(){
    for (Carta cartaEnMano : manoCartas) {
      if (cartaEnMano != null) {
          valorMano += cartaEnMano.getValor();
      }
  }
  }

  // Getter para obtener el valor de la mano
  public double getValorMano() {
      return valorMano;
  }

  public void apostar(double cantidadApostar) {
    if (cantidadApostar <= saldo) {
        this.saldo += cantidadApostar;
    } else {
        System.out.println("No puedes apostar más de lo que tienes en tu saldo.");
    }
  }

}

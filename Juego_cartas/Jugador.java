// package SieteYMedia;

/**
 * Clase Jugador para el juego de las Siete y Media
 * @author Elías Robles
 */

public class Jugador {
  
  private double saldo;
  private double apuestaActual;
  private Carta[] manoCartas;
  private int posMano;
  private double valorMano;

  // Constructor de Jugador
  public Jugador() {
      this.saldo = 0.0;
      this.apuestaActual = 0.0;
      this.manoCartas = new Carta[10]; // Máximo de 10 cartas en la mano
      this.valorMano = 0.0;
      this.posMano = 0;
  }

  public void agarrarCarta() {
    Carta cartaActual = Baraja.sacarCarta();
    manoCartas[posMano] = cartaActual;
    posMano++;
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
  this.saldo += this.apuestaActual;
}


  // Método para meter carta en la mano
  public void meterCartaEnLaMano(Carta carta) {
      // Verificar si hay espacio en la mano
      if (manoCartas[0] == null) {
          // Metes la carta en el índice 0
          manoCartas[0] = carta;
          
          // Bucle para calcular y acumular el valor de la mano
          valorMano = 0.0;
          for (Carta cartaEnMano : manoCartas) {
              if (cartaEnMano != null) {
                  valorMano += cartaEnMano.getValor();
              }
          }
      } else {
          System.out.println("La mano ya tiene una carta en la posición 0. No se puede agregar más.");
      }
  }

  // Getter para obtener el valor de la mano
  public double getValorMano() {
      return valorMano;
  }

  public static void main(String[] args) {
    
  }
  
  
}
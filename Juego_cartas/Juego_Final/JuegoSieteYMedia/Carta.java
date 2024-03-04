// package SieteYMedia;

/**
 * Clase Cartas para el juego de las Siete y Media
 * @author Elías Robles
 * @author Luis Godino
 */

public class Carta { 

  // Atributos de las cartas
  private String palo;  // Palo en el que se encuentra una carta de X número
  private String numero;  // Numero de la carta para saber su valor
  private double valor;  // Valores asociados al numero de la carta

  // Dominio de posibles Palos y Numero de las cartas
  private static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private static String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

  // Constructor de cartas
  public Carta(double valorCarta, String paloCarta, String numeroCarta) {
    this.valor = asignarValor(numeroCarta);
    this.palo = paloCarta;
    this.numero = numeroCarta;
  }

  // Getter (para pruebas)
  public String getValores() {
    return this.numero + " de " + this.palo + ", Valor: " + this.valor;
  }

  public double getValor() {
    return this.valor;
  }

  // Método para asignar valores
  public static double asignarValor(String numero) {
    switch (numero) {
      case "1":
        return 1;
      case "2":
        return 2;
      case "3":
        return 3;
      case "4":
        return 4;
      case "5":
        return 5;
      case "6":
        return 6;
      case "7":
        return 7;
      default:
        return 0.5;  // Sota, Caballo y Rey
    }
  }

  // Método para inicializar las cartas
  public static Carta[] inicializarCartas() {
    Carta[] cartas = new Carta[40];
    int contador = 0; //Aqui asignamos los valores para las cartas y los metemos en el array
                      //Cualquier duda escrime al discord Luis

    for (String palo : palos) {
      for (String numero : numeros) {
        double valor = asignarValor(numero);
        cartas[contador] = new Carta(valor, palo, numero);
        contador++;
      }
    }

    return cartas;
  }

  

  @Override
  public String toString() {
    return numero+" de "+palo;
  }

  public static void main(String[] args) {
    Carta[] cartas = inicializarCartas();

    for (int i = 0; i < 40; i++) {
        System.out.println(cartas[i].getValores());
    }
  }
} //Deberias duplicar el array de las cartas para la Baraja y remezclarlo en el nuevo array
  //Puedes hacer un método que te devuelva una baraja mezclada
  //Yo haría eso para que en la siguiente ronda las cartas se reseteen y se pongan en sus lugar
  //También podría ser así como lo tienes pero con un bucle for mejor
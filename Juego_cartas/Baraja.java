public class Baraja {
  
  //Atributos
  private Carta cartas[];
  private int posCartas;

  //Constructor
  public Baraja(){
    this.posCartas = 0;
  }

  //Métodos
  
  public void barajarCartas(){
    int posAleatoria = 0;
    Carta carta;

    for (int i = 0; i < cartas.length; i++) {
      posAleatoria = (int)(Math.random()*40);
      
      carta = cartas[i];
      cartas[i] = cartas[posAleatoria];
      cartas[posAleatoria] = carta;

    }
  }
}
  

public class Carta {
  private static String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
  private static String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

  private String palo;
  private String valor;

  public Carta(){
    this.palo = palos[(int)(Math.random()* 4)];
    this.valor = numeros[(int)(Math.random()* 10)];
  }

  public String getPalo() {
    return palo;
  }

  public String getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valor +" de "+palo ;
  }

  
}

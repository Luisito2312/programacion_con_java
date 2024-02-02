public class Terminal {
  
  ////Atributos
  private String numero;
  private int tiempoConversacion;     //Segundos
  

  ////Constructores
  public Terminal(String numero) {
    this.numero = numero;
  }

  ////Getters
  public String getNumero() {
    return numero;
  }


  public int getTiempoConversacion() {
    return tiempoConversacion;
  }

  ////Setters
  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTiempoConversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº "+ numero + " - "+ tiempoConversacion + " s de conversacion";
  }

  public void llama(Terminal T, int tiempoConversacion) {
    this.tiempoConversacion += tiempoConversacion;
    T.tiempoConversacion += tiempoConversacion;
  }
  

}

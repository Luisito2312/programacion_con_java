public abstract class Vehiculo {
  //Atributos de la clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  //Atributos de instancia
  private int kilometrosRecorridos;

  //Constructor
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    vehiculosCreados++;
  }

  //Getters
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int km){
    this.kilometrosRecorridos += km;
    kilometrosTotales += km;
  }

  //Metodos de clase
  public static int getKilometrosTotales(){
    return kilometrosTotales;

  
  }
}

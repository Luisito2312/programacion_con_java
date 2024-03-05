package clases;

public abstract class Mascota implements MascotaInterface{
  
  ////Atributos
  protected String chip;
  protected String nombre;
  protected int edad;
  protected boolean vacunada;
  private static int totalMascotas = 0;

  //Constructores
  public Mascota(String chip){
    this.chip = chip;
    this.vacunada = false;
    totalMascotas++;
  }

  public Mascota(String chip, String nombre){
    this.chip = chip;
    this.nombre = nombre;
    this.vacunada = false;
    totalMascotas++;
  }

  //getters y setters
  public String getNombre(){
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }


  public static int getTotalMascotas() {
    return totalMascotas;
  }

  public String getChip() {
    return chip;
  }

  //Metodos
  public void vacunar(){
    this.vacunada = false;
  }

  @Override
  public String toString() {
    return "Mascota [" + chip + "]: " + nombre + ", " + edad ;
  }
  
  
  
}

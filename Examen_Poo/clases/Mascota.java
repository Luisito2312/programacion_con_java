package clases;

public class Mascota implements MascotaInterface{
  
  ////Atributos
  public String chip;
  public String nombre;
  public int edad;
  public boolean vacunada;
  public static int totalMascotas;

  
  //Getters
  public String getChip() {
    return chip;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  //Metodos
  public void vacunar(){
    vacunada = false;
  }

  public void pasear(){

  }

  @Override
  public String toString() {
    return "`[" + chip + "]: " + nombre+" "+ edad+" años";
  }
  
  
}

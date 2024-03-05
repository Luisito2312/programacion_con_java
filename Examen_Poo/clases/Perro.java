package clases;

public class Perro extends Mascota{
  
  //Atributos
  private String raza;
  

  private static int totalPerros = 0;

  //Constructores
  public Perro(String chip) {
    super(chip);
    totalPerros++;
  }

  public Perro(String chip, String nombre) {
    super(chip, nombre);
    totalPerros++;
  }

  //getter
  public static int getTotalPerros() {
    return totalPerros;
  }

  public String getRaza() {
    return raza;
  }
  //Setters
  public void setRaza(String raza) {
    this.raza = raza;
  }
  //Métodos
  public void ladrar(){
    System.out.println("Guau, Guau");
  }
  
  public void grunir(){
    System.out.println("Grrrr...");
  }

  @Override
  public void pasear(){
    if (!vacunada) {
      System.out.println(this.getNombre()+" no puede pasear hasta no estar vacunado/a");
    } else if (this.vacunada) {
      ladrar();
    }
  }

  @Override
  public void vacunar(){
    if (this.vacunada) {
      System.out.println(this.getNombre()+" ya está vacunado/a");
    } else if (!this.vacunada) {
      super.vacunar();
      grunir();

    }
  }
}

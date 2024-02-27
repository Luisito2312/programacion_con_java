package clases;

public class Perro extends Mascota{
  
  String raza;
  public static int totalPerros;

  //Constructores
  public Perro(String chip) {
    super();
    this.chip = chip;
  }

  public Perro(String chip, String nombre) {
    super();
    this.chip = chip;
    this.nombre = nombre;
  }

  
  //Getters y setters
  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }

  //Métodos
  public void ladrar(){
    System.out.println("Guau, Guau");
  }
  
  public void gruñir(){
    System.out.println("Grrrr...");
  }

  public void pasear(Boolean vacunada, String nombre){
    if (!this.vacunada) {
      System.out.println(nombre+" no puede pasear hasta no estar vacunado/a");
    } else if (this.vacunada) {
      ladrar();
    }
  }

  public void vacunar(boolean vacunada, String nombre){
    if (this.vacunada) {
      System.out.println(nombre+" ya está vacunado/a");
    } else if (!this.vacunada) {
      vacunada = true;
      gruñir();

    }
  }
}

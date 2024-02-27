package clases;

public class Gato extends Mascota{

  String pelaje;
  public static int totalGatos = 0;

  //Constructores
  public Gato(String chip) {
    super();
    this.chip = chip;
  }

  public Gato(String chip, String nombre) {
    super();
    this.chip = chip;
    this.nombre = nombre;
  }

  
  //Getters y setters
  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }

  //Metodos
  public void maullar(){
    System.out.println("“¡Miaaaaauuuuuu! Brrrrr….");
  }
  
  public void bufar(){
    System.out.println("Fuuuuuu…");
  }

  public void pasear(Boolean vacunada, String nombre){
    if (!this.vacunada) {
      System.out.println(nombre+" no puede pasear hasta no estar vacunado/a");
    } else if (this.vacunada) {
      maullar();
    }
  }

  public void vacunar(boolean vacunada, String nombre){
    if (this.vacunada) {
      System.out.println(nombre+" ya está vacunado/a");
    } else if (!this.vacunada) {
      vacunada = true;
      bufar();

    }
  }
}

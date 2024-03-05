package clases;

public class Gato extends Mascota{

  private String pelaje;
  

  private static int totalGatos = 0;

  //Constructores
  public Gato(String chip) {
    super(chip);
    totalGatos++;
  }

  public Gato(String chip, String nombre) {
    super(chip, nombre);
    totalGatos++;
  }

  
  //Getters y setters
  public static int getTotalGatos() {
    return totalGatos;
  }

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }
  
  //Metodos
  public void maullar(){
    System.out.println("“¡Miaaaaauuuuuu! Brrrrr….");
  }
  
  public void bufar(){
    System.out.println("Fuuuuuu…");
  }

  @Override
  public void pasear(){
    if (!vacunada) {
      System.out.println(this.getNombre()+" no puede pasear hasta no estar vacunado/a");
    } else if (this.vacunada) {
      maullar();
    }
  }

  @Override
  public void vacunar(){
    if (this.vacunada) {
      System.out.println(this.getNombre()+" ya está vacunado/a");
    } else if (!this.vacunada) {
      super.vacunar();
      bufar();

    }
  }
}

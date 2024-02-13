/*
 Clase de ejemplo coche
 * 
 * @author Luis Godino
 */
public class Coche {

  //Atributos
  private String matricula;
  private String marca;
  private String modelo;
  private int kilometraje;
 
  //////Constructor
  public Coche(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.kilometraje = 0;
  }

  ////Getter
  public int getKilometraje() {
    return this.kilometraje;
  }

  }

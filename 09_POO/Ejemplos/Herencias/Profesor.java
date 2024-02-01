package Herencias;
/*
Clase profesor * 
 * @author Luis Godino
 */
public class Profesor extends Personas {
  
  
  //////Atributos
  private String departamento;
  private double sueldo;

  /////Constructores
  public Profesor(String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  //////Getters
  public String getDepartamento() {
    return departamento;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + "[Profesor] Departamento: "+ departamento;
  }
}

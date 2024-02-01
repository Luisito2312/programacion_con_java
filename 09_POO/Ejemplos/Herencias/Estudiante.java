package Herencias;
/*
Clase estudiante que hereda de la clase persona * 
 * @author Luis Godino
 */

public class Estudiante extends Personas {

  //////Atributos
  private int creditos;


  //////Constructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }
  
  public Estudiante(String nombre, String dni, int creditos, int edad){
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos(){
    return this.creditos;
  }

  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Estudiante matriculado en: "+creditos+" creditos.");

  }
}

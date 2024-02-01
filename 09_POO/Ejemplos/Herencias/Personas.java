package Herencias;
/*
Aqui creo la clases personas para ver la herencia en programacion orientada a objetos * 
 * @author Luis Godino
 */
public class Personas {
  
  /////Atributos
  private String nombre;
  private int edad;
  private String dni;
  

  /////COnstructores
  public Personas(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  /////Getters
  public String getNombre() {
    return this.nombre;
  }


  public int getEdad() {
    return this.edad;
  }


  public String getDni() {
    return this.dni;
  }

  public void mostrarDatos(){
    System.out.println("Nombre: "+ nombre + "\tEdad: " + edad + "\tDNI: " +dni);
  }
  
}

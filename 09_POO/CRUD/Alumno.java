package CRUD;

public class Alumno {
  ////Atribuos
  private String nombre;
  private int edad;

  
  public Alumno(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  ///Setters y getters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }


  public void eliminarAlumno(String nombre){
    
  }
  
}

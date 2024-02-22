public class Caballo {
  ////Atributos
  String sexo;
  String edad;
  String color;
  
  ///Constructor
  public Caballo(String sexo, String edad, String color) {
    this.sexo = sexo;
    this.edad = edad;
    this.color = color;
  }

  ///Getters y Setters
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  ///Funciones
  public void metrosRecorridos(int m){
    System.out.println("El caballo ha recorrido "+ m+" metros");
  }
  
  //public void vivoOMuerto(boolean )
}

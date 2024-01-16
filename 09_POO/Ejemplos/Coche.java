/*
 Clase de ejemplo coche
 * 
 * @author Luis Godino
 */
public class Coche {

  //Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    //formula : Nombre_clase nombre_objeto = new Nombre_Clase() 
    Coche miCoche = new Coche(); //Coche 1
    Coche tuCoche = new Coche(); //Coche 2


    miCoche.matricula = "1234ACB";

    System.out.println("Matricula del coche 1: "+ miCoche.matricula);
    System.out.println("La potencia del coche 2 es: " + tuCoche.potencia);
    System.out.println("Matricula del coche 2: "+ tuCoche.matricula);
    System.out.println("La potencia del coche 1 es: " + miCoche.potencia);

  }
}

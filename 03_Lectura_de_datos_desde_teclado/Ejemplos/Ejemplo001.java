/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */
public class Ejemplo001 {
  public static void main(String[] args) {
    String nombre;

    System.out.print("¿Cuál es tu nombre?");

    nombre = System.console().readLine(); //Esta línea es para pedir información por pantalla.

    System.out.println(nombre);
  }
}

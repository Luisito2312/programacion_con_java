/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creamos un objeto de la clase scanner

    System.out.println("Intrduce tu nombre: ");
    String nombre = sc.nextLine(); // Guardamos el nombre antes solicitado en la variable nombre

    System.out.println("Introduce tu edad: ");
    int edad = sc.nextInt(); // Y aquí lo mismo con la edad

    System.out.println("Tu nombre es " + nombre+ " y tienes " + edad + " años");
  }
}

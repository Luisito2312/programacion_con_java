/*
 Lectura de datos por teclado usando scanner y usando .next()
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner
    
    System.out.println("Introduce tu nombre y tu edad ( separados por un espacio): ");
    String nombre = sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

    sc.close();
  }
}

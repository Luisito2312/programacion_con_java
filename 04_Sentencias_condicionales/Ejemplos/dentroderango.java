/*
 Hacer un programa que te pida un numero entre un rango y si lo aciertas te dice que bien si no qye mal
 * 
 * @author Luis Godino
 */
import java.util.Scanner;
public class dentroderango {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int numero;

      System.out.println("Introduce un número entre 1 y 100: ");
      numero = sc.nextInt();

 
        if ((numero <100) && (numero > 1))  {
          System.out.println("Bien, el valor introducido está dentro de los parámetros acordados");
        } else {
          System.out.println("No has cumplido tu parte del trato, era un número entre 1 y 100");
        }
    }
  }
}


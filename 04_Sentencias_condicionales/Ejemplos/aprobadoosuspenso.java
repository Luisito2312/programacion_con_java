/*
 Programa que solicita un vlaor numerico por pantalla y que muestre por pantalla si has aprobado o no 
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class aprobadoosuspenso {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Introduce tu nota: ");
      Double nota = input.nextDouble();

      if (nota >= 5) {
        System.out.println("Ha aprobado el examen con un: " + nota);
        
      }
      else {
        System.out.println("Ha suspendido el examen con un: " + nota);
      } 
  }
  }
}
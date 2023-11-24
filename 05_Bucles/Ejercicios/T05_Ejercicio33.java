/*
 Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura de la U");
    int altura = sc.nextInt();

    for (int i = 0; i < altura -1; i++) {
      System.out.print("*");
      for (int j = 0; j < (altura -2); j++) {
        System.out.print(" ");
        
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for (int h = 0; h < altura - 2; h++) {
      System.out.print("*");
    }
sc.close();
  }
}
/*
 En este código sacamos el area de un rectangulo
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura y el ancho de un rectángulo en se orden ");

    Double largo = sc.nextDouble();
    Double ancho = sc.nextDouble();

    Double area = largo * ancho;

    System.out.println("El área del rectángulo es: " + area);

    sc.close();
  }
}

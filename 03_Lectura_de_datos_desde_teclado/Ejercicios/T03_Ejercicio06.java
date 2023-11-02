/*
 En este código sacamos el area de un triángulo
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la base y la altura del triángulo ");

    Double base = sc.nextDouble();
    Double altura = sc.nextDouble();

    Double area = (base * altura) / 2;

    System.out.println("El área del rectángulo es: " + area);

    sc.close();
  }
}

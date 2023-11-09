/*
Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número por pantalla");
    Double a = sc.nextDouble();

    Double b = a % 10;
    Double c = a % 100;

    if (a<100) {
      System.out.println(b);
    } else if (a >= 100){
      System.out.println(c);
    }
    sc.close();
  }
}

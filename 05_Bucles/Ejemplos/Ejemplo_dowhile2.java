/*
 Lee números por el teclado mientras el número sea par
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class Ejemplo_dowhile2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num = 0;

    do {
      System.out.println("Introduce un número");
      num = sc.nextInt();
    } while (num % 2 == 0);

    System.out.println("Ha introducido un número impar");
    sc.close();
  }
}

/*
 Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int j = 0;
    int k = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.println("Introduce un número");
      int n = sc.nextInt();

      if (n > 0) {
        j++;
      } else {
        k++;
      }
    }

    System.out.println("Hay "+j+" números positivos y "+k+" números negativos");

    sc.close();
  }
}

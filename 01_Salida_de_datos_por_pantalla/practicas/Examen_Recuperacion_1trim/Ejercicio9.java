/*
 N primeros primos:
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    int numero = sc.nextInt();

    int j = 0;

    for (int i = 1; i <= numero; i++) {
      j = 0;
      for (int k = 1; k <= i; k++) {
        if (i % k == 0) {
          j++;
        }      
      }
      if (j ==2) {
        System.out.println("El número "+i+" es primo");
      } else if (j != 2) {
    }
  }

  sc.close();
}
}


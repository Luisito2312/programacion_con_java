/*
 Primo: solicita un valor numérico entero positivo y muestra en pantalla si es un número primo.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número para ver si es primo");
    int num = sc.nextInt();

    int j = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        j++;
      }
    }

    if (j == 2) {
      System.out.println("El número es primo");
    } else if (j !=2) {
      System.out.println("El número no es primo");
    }

    sc.close();
  }
}

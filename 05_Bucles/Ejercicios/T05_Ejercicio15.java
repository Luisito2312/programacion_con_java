/*
 Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int segunda = 0;

    System.out.println("Introduce un número base");
    int base = sc.nextInt();

    System.out.println("Introdudce un número como exponente");
    int n = sc.nextInt();

    System.out.println(base);
    segunda = base * base;
    for (int i = 1; i <= n; i++) {
      
      System.out.println(segunda);
      segunda = segunda * base;
    }
    sc.close();
  }
}

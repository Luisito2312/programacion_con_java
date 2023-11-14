/*
 Contador de números positivos introducidos por teclado
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejemplo_while2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;
    System.out.println("Introduce un número");
      int num = sc.nextInt();

    while (num > 0) {
      System.out.println("Número introducido "+ num);
      System.out.println("Introduzca otro número");
      num = sc.nextInt();
      i++;
    }
    System.out.println("Ha introducido un número que no es entero");
    System.out.println("En total ha introducido "+i+ " números positivos");

    sc.close();
  }
}

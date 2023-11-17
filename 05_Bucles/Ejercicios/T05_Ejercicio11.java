/*
 Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 1;

    System.out.println("Introduce un número para realizar el cubo y cuadrado");
    int n = sc.nextInt();
    
    System.out.println("Número  Cuadrado   Cubo");
    do {
      int cuadrado = n * n;
      int cubo = n * n* n;


      System.out.printf(" %2d    %6d    %6d\n", n , cuadrado, cubo);
      n++;
      i++;
    } while (i <= 5);
sc.close();
  }
}

/*
Factorial
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número para calcular su factorial");
    int numero = sc.nextInt();

    int aux = 1;

    for (int i = 1; i <= numero; i++) {
      aux *= i;
    }

    System.out.println(numero+"! = "+aux);

    sc.close();
  }
}

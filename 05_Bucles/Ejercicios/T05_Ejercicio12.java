/*
 Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = 0;
    int b = 1;

    System.out.println("Introduce el número de veces que mostrar la sucesión");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
    }
    sc.close();
  }
}

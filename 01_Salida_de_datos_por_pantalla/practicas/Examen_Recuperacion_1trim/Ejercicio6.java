/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número entero");
    int numero = sc.nextInt();

    int sumaDivisores = 0;

    for (int i = 1; i < numero; i++) {
      if (numero % i == 0) {
        System.out.println("El número "+i+ " es un divisor propio de "+numero);
        sumaDivisores += i;
      }
    }
    System.out.println("la suma de los divosores propios es: "+ sumaDivisores);

    sc.close();
  }
}

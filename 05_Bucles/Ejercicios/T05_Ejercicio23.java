/*
 Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio23 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int suma = 0;
    int i = 0;

    for (i = 0; suma <= 10000; i++) {
      System.out.println("Introduce un número para sumar");
      int n = sc.nextInt();

      suma =+ n;

      if (suma >=10000) {
        System.out.println("El número introducido supera el límite");
      }
      
    }
    int media = suma / i;

    System.out.println("La suma total es: "+suma);
    System.out.println("La media de los números introducidos es: "+media);
    sc.close();
  }
}

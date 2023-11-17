/*
 Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num;
    int suma = 0;
    int n = 0;

    do {

      System.out.println("Introduce un número");
      num = sc.nextInt();

      if (num>0) {
        suma = suma + num;
        n++;
      }

    } while (num > 0);

    System.out.println("La media es: " +suma / n );
    sc.close();
  }
}

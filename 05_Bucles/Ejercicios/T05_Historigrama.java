/*
 Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T05_Historigrama {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un carácter");
    String caracter = sc.nextLine();

    System.out.println("Introduce un número");
    
    for (int n = 1; n > 0;) {
      
      n = sc.nextInt();
      for (int j = 0; j < 1; j++) {
        System.out.print(" | ");
        for (int j2 = 0; j2 < n; j2++) {
          System.out.print(caracter);
          
        }
        System.out.println("\n");
      }
      
      }
    }
  }


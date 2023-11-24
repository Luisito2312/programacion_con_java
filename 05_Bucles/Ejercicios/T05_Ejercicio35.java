/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio35 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la altura de la X ");
    int altura = sc.nextInt();

    for (int i = 0; i < altura; i++) {
      System.out.print("*");

      for (int j = 0; j < altura - 2; j++) {
        System.out.print(" ");
      }
    }
    sc.close();
  }
}

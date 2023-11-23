import java.util.Scanner;

public class T05_Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura de la U");
    int altura = sc.nextInt();

    for (int i = 0; i < altura -1; i++) {
      System.out.print("*");
      for (int j = 0; j < (altura -2); j++) {
        System.out.print(" ");
        
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for (int h = 0; h < altura - 2; h++) {
      System.out.print("*");
    }
sc.close();
  }
}
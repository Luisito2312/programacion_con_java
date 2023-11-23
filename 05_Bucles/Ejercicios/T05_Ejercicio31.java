import java.util.Scanner;

public class T05_Ejercicio31 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la altura de la L");
    int altura = sc.nextInt();

    for (int i = 0; i < (altura - 1); i++) {
      System.out.println("*");
    }

    for (int i = 0; i < ((altura / 2)+1); i++) {
      System.out.print("*");
    }
    sc.close();
  }
}
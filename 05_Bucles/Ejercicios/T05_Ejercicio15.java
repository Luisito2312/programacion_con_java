import java.util.Scanner;

public class T05_Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número base");
    int base = sc.nextInt();

    System.out.println("Introdudce un número como exponente");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.println(base+"\u00B1");
    }
  }
}

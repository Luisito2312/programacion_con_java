import java.util.Scanner;

public class T05_Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int segunda = 0;

    System.out.println("Introduce un número base");
    int base = sc.nextInt();

    System.out.println("Introdudce un número como exponente");
    int n = sc.nextInt();

    System.out.println(base);
    segunda = base * base;
    for (int i = 1; i <= n; i++) {
      
      System.out.println(segunda);
      segunda = segunda * base;
    }
    sc.close();
  }
}

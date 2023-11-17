import java.util.Scanner;

public class T05_Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    int n = sc.nextInt();

    int j = n;
    int x = n+100;

    for (int i = n; i <= x; i++) {

     n = n + i;

    }
    System.out.println(n-j);
    sc.close();
  }
}

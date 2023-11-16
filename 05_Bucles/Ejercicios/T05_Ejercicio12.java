import java.util.Scanner;

public class T05_Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = 0;
    int b = 1;

    System.out.println("Introduce el número de veces que mostrar la sucesión");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
    }
    sc.close();
  }
}

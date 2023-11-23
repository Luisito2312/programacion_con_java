import java.util.Scanner;

public class T05_Ejercicio32 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;

    System.out.println("Introduce un número entero y positivo");
    int n = sc.nextInt();

    do {
      int numeros = n % 10;
      System.out.print(numeros);
    } while (i < 100);
  }
}

import matematicas.varias;
import java.util.Scanner;


public class Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

  System.out.println("Introduce un número");
  int x = sc.nextInt();

  System.out.println("Introduce la posición del número");
  int n = sc.nextInt();

  System.out.println("El número que se encuentra en la posición indicada es: "+ varias.digitoN(x, n));
  sc.close();
  }

  
}

import java.util.Scanner;

public class T05_Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num;
    int suma = 0;
    int n = 0;

    do {

      System.out.println("Introduce un número");
      num = sc.nextInt();

      if (num>0) {
        suma = suma + num;
        n++;
      }

    } while (num > 0);

    System.out.println("La media es: " +suma / n );
    sc.close();
  }
}

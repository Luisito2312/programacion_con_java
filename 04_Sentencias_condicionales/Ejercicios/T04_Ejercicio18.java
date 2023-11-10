/*
 Hacer un código que 
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int primera = 0;

    System.out.println("Introduce un número");
    primera = sc.nextInt();

    if (primera <= 10){
      System.out.println(primera);
    } else if ((primera >= 10) && (primera <= 100)) {
      System.out.println(primera / 10);
    } else if ((primera >= 100) && (primera <= 1000)){
      System.out.println(primera / 100);
    } else if ((primera >= 1000) && (primera <= 10000)){
      System.out.println(primera / 1000);
    } else if ((primera >= 10000) && (primera <= 100000)){
      System.out.println(primera / 10000);
    }
    sc.close();
  }
}

import java.util.Scanner;

public class T04_Ejercicio19 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int primera = 0;

    System.out.println("Introduce un número");
    primera = sc.nextInt();

    if ((primera < 10) && (primera > -10)){
      System.out.println("El número introducido tiene 1 cifra");
    } else if ((primera >= 10) && (primera <= 100)) {
      System.out.println("El número introducido tiene 2 cifras");
    } else if ((primera >= -10) && (primera <= -100)){
      System.out.println("El número introducido tiene 2 cifras");
    } else if ((primera >= 100) && (primera <= 1000)){
      System.out.println("El número introducido tiene 3 cifras");
    } else if ((primera >= -100) && (primera <= -1000)) {
      System.out.println("El número introducido tiene 3 cifras");
    } else if ((primera >= 1000) && (primera <= 10000)){
      System.out.println("El número introducido tiene 4 cifras");
    } else if ((primera >= -1000) && (primera <= -10000)) {
      System.out.println("El número introducido tiene 4 cifras");
    } else if ((primera >= 10000) && (primera <= 100000)){
      System.out.println("El número introducido tiene 5 cifras");
    } else if ((primera >= -10000) && (primera <= -100000))
    sc.close();
  
  }
}

/*
 Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número entero y positivo");
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

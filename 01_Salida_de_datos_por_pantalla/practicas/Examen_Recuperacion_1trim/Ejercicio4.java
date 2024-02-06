/*
 Longitud de un número: solicita un número entero y devuelve el número de dígitos que lo componen. 
 * 
 * @author Luis Godino
 */
import java.util.Scanner;


public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long numero;
    int i = 0;

    System.out.println("Introduce un número para ver cuantos digitos tiene");
    numero = sc.nextLong();

    do {
      numero /= 10;
      i++;
    } while (numero !=0);

    System.out.println("El número tiene: "+i+" número de dígitos");

    sc.close();
  }
}

/*
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    long num;
    int cantidadDeDigitos = 1; // En caso de no entrar en el primer bucle, el número es de una cifra.

    System.out.println("Introduzca un número entero y le diré cuantos dígitos tiene");
    num = sc.nextLong();
    long n = num;
    sc.close();

    while (n > 10) {
       n /= 10;
      cantidadDeDigitos++;
    }

    System.out.println("Su número tiene "+cantidadDeDigitos+" dígitos");

  }
}

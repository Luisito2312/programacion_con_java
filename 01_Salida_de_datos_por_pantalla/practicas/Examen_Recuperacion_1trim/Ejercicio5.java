/*
 Dígitos pares e impares: solicita un valor de tipo numérico largo y devuelve cuántos dígitos pares y cuántos dígitos impares hay
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número para ver cuantos pares e impares tiene");
    long numero = sc.nextLong();

    long copiaNumero = numero;
    long aux;
    int pares = 0;
    int impares = 0;

    do {
      aux = copiaNumero % 10;
      copiaNumero %= 10;
      if (aux % 2 == 0 ) {
        pares++;
      } else  {
        impares++;
      }
    } while (copiaNumero !=0);

    System.out.println("El número "+numero+" tiene "+pares+" pares, y "+impares+"impares");

    sc.close();
  }
}

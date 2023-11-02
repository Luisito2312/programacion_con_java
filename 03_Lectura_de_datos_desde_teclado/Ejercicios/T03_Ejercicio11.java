/*
 Aquí tengo que hacer un conversor de Kilobytes a Megabytes
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Itroduce el número de KB que quiere cambiar: ");
    Double kb = sc.nextDouble();

    Double mb = kb * 0.001;

    System.out.println("El total de Megabytes es: " + mb);

    sc.close();
  }
}

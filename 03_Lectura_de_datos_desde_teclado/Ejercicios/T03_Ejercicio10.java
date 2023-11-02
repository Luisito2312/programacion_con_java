/*
 Tengo que hacer un conversor de Megabytes a Kilobytes
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Itroduce el número de MB que quiere cambiar: ");
    Double mb = sc.nextDouble();

    Double kb = mb * 1000;

    System.out.println("El total de Kilobytes es: " + kb);

    sc.close();
  }
}

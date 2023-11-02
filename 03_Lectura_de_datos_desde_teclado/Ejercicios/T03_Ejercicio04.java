/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio04 {
  public static void main(String[] args) {
    double cambio = 0.006; 

    Scanner sc = new Scanner(System.in);
    int euross;

    System.out.println("Introduca el importe de euros a cambiar:");
    euross = sc.nextInt();

          
    double pesetas = euross * cambio;

          System.out.println(pesetas + " el total de pesetas es " + pesetas + " pesetas.");

          sc.close();
  }
}

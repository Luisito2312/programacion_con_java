/*
 En este código tengo que calcular el volumen de un cono
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el radio del cono");
    Double radio = sc.nextDouble();

    System.out.println("Introduzca la altura del cono");
    Double altura = sc.nextDouble();

    Double volumen = (Math.PI * (radio * radio) * altura) /3;

    System.out.println("El volumen del cono es de: " + volumen);

    sc.close();
  }
}

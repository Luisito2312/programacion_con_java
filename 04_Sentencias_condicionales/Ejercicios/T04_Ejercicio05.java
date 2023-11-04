/*
 Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa resuelve la ecuación ax+b = 0, introduce el valor de a y b separados por un espacio");
    double a = sc.nextInt();
    double b = sc.nextInt();

    double x = -b / a ;

     if (( a == 0 ) || ( b == 0 )){
      System.out.println("El valor introducido para una de las variables hace que el resultado no sea posible");
     }
     else {
      System.out.println("El resultado de la ecuación es: " + x);
     }
    sc.close();
  }
}

/*
 Tengo que hacer un código que me ordene tres números de mayor a menor
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce 3 números por pantalla separados por un espacio");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if ( num1 > num3 ){
      if ( num3 > num2) {
        System.out.println("El orden es: "+num1 + num3 + num2);
      } else if (num1 > num2) {
        System.out.println("El orden es: " +num1+num2+num3);
      }
      } else if (num2 > num3) {
        if (num3 > num1) {
          System.out.println("EL orden es: "+num2+num3+num1);
        } else if (num2 > num1) {
          System.out.println("El orden es: "+num2+" "+num1+num3);
        }
      } else if (num3 > num1) {
        if (num1 > num2) {
          System.out.println("El orden es: "+num3+num2+num1);
        } else if (num3 > num2) {
          System.out.println("El orden es: "+num3+num1+num2);
        }
      } sc.close();
    } 
  }


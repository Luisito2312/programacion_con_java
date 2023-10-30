/*
 En este código se hace un conversor de euros a pesetas en el que se introduce la cantidad que se va a cambiar
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio02 {
  public static void main(String[] args) {
    
              
   double cambio = 166.386; 

        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Introduzca el número de euros: ");
          double euros = input.nextDouble();

          
          double pesetas = euros * cambio;

          System.out.println(euros + " el total de euros es " + pesetas + " pesetas.");
        }
  }
}

/*
 En este código se hace un conversor de euros a pesetas en el que se introduce la cantidad que se va a cambiar
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio03 {
  public static void main(String[] args) {
    
              
   double cambio = 0.006; 

        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Introduzca el número de pesetas: ");
          double pesetas = input.nextDouble();

          
          double euross = pesetas * cambio;

          System.out.println(pesetas + " el total de euros es " + euross + " euros.");
        }
  }
}

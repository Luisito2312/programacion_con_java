/*
 Hay que hacer un switch o segun que recoja algo distinto para cada dia de la semana
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class Ejemplo03 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      int dia;

      System.out.println("Introduca el día de la semana");
      dia = sc.nextInt();

      switch (dia) {
        case 1:
          System.out.println("Es un dia entre semana");
          break;
      
        default :
          break;

        case 2:
          System.out.println("Es un dia entre semana");
          break;

        case 3:
          System.out.println("Es un dia entre semana");
          break;  
      
        case 4:
          System.out.println("Es un dia entre semana");
          break;

        case 5:
          System.out.println("Es un dia entre semana");
          break;  

        case 6:
          System.out.println("Es fin de semana");
          break;   
          
        case 7:
          System.out.println("Es fin de semana");
          break;   
        }
    }



  
}


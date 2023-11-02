/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class ejemplo4 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      int dia;
      System.out.println("Introduca el día de la semana");
      dia = sc.nextInt();

      switch (dia) {
        case 1:              
        case 2:
        case 3:
        case 4:
        case 5:
          System.out.println("Es un dia entre semana");
          break;  

        case 6:
        case 7:
          System.out.println("Es fin de semana");
          break;   
        }
        sc.close();  
      }  
}

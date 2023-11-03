/*
 Tengo que hacer un código que al introducir un dia de la semana, me diga que asignatura hay a primera hora ese día
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int dia;

      System.out.println("Introduca el día de la semana");
      dia = sc.nextInt();

      switch (dia) {
        case 1:
          System.out.println("A primera hora los lunes hay FOL");
          break;
      
        default :
          break;

        case 2:
          System.out.println("A primera hora los martes hay Programación");
          break;

        case 3:
          System.out.println("A primera hora los miércoles hay Entornos de desarrollo");
          break;  
      
        case 4:
          System.out.println("A primera hora los jueves hay Bases de datos");
          break;

        case 5:
          System.out.println("A primera hora los viernes hay Programación");
          break;  
        }
    sc.close(); 
  }
}

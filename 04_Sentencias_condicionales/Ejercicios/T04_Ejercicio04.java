/*
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca las horas que trabaja semanalmente: ");
    int horas = sc.nextInt();

    int salario = horas * 12;
    int paga = horas * 16;

    if ( horas <= 40) {
      System.out.println("Su paga semanal en función de las horas que trabaja es: " + salario);
    }
    else if ( horas > 40) {
      System.out.println("Su paga semanal en función de las horas que trabaja es: " + paga);
    }

    sc.close();
  }
}

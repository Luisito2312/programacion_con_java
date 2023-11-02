/*
 En este código tengo que calcular el salario semanal de un empleado
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca las horas que trabaja semanalmente: ");
    Double horas = sc.nextDouble();

    Double salario = horas * 12;

    System.out.println("Su paga semanal en función de las horas que trabaja es: " + salario);

    sc.close();
  }
}

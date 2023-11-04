/*
 Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2h / g , siendo g = 9:81m/s2
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la altura desde la que caerá el objeto ");
    int altura = sc.nextInt();

    final double gravedad = 9.81;

    double operacion = Math.sqrt((2 * altura) / gravedad);

    System.out.println("El resultado de la operación es: " + operacion);

    sc.close();
  }
}

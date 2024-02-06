/*
 Pide 3 notas y hace la media del alumno
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double nota3;

    Scanner sc = new Scanner(System.in);
  
    System.out.println("Introduce la primera nota");
    nota1 = sc.nextDouble();

    System.out.println("Introduce la segunda nota");
    nota2 = sc.nextDouble();

    System.out.println("Introduce la tercera nota");
    nota3 = sc.nextDouble();

    double media = (double)(nota1 + nota2 + nota3) / 3;

    if (media >= 5) {
      System.out.printf("Has aprobado con un: \033[0;32m %.2f " , media);
      
    } else {
      System.out.printf("Has suspendido con un: \033[0;31m %.2f \033[0;0m", media);
    }

    sc.close();
  }
}
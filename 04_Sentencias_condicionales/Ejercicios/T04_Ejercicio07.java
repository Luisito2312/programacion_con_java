/*
 Haz un código que te haga media de tres notas
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce las 3 notas de tus exámenes separadas por espacio");
    Double nota1 = sc.nextDouble();
    Double nota2 = sc.nextDouble();
    Double nota3 = sc.nextDouble();

    Double notafinal = (nota1 + nota2 + nota3) / 3;

    if (notafinal < 5 ) {
      System.out.println("Has suspendido");
    }
    else {
      System.out.println("Has aprobado");
    }

    sc.close();
  }
}

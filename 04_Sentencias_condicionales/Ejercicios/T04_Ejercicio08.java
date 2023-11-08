/*
 Haz un código que te haga media de tres notas y que te diga que tienes.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce las 3 notas de tus exámenes separadas por espacio");
    Double nota1 = sc.nextDouble();
    Double nota2 = sc.nextDouble();
    Double nota3 = sc.nextDouble();

    Double notafinal = (nota1 + nota2 + nota3) / 3;

    if (notafinal <= 4 ) {
      System.out.println("Has sacado un insuficiente");
    }
    else if ((notafinal > 4) && (notafinal <= 6)){
      System.out.println("Has sacado un suficiente");
    }
    else if ((notafinal >= 6) && (notafinal < 7)){
      System.out.println("Has sacado un bien");
    }
    else if ((notafinal >= 7) && (notafinal < 9)){
      System.out.println("Has sacado un notable");
    }
    else if ((notafinal >= 9)){
      System.out.println("Has sacado un sobresaliente");
    }

    sc.close();
  }
}

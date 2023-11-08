/*
 Tengo que hacer un código que me resuelva una ecuación de segundo grado 
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T04_Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce los valores a, b y c para la ecuación, separados por un espacio");
    Double a = sc.nextDouble();
    Double b = sc.nextDouble();
    Double c = sc.nextDouble();

    Double raiz = Math.sqrt((-b*(-b))-4*a*c);
    Double ecuacion =( -b + raiz ) / (2 * a);

    if ((a <= 0 ) || (b <= 0)) {
      System.out.println("No ha introducido un valor correcto");
    }
    else if (c <= 0){
      System.out.println("Ha introducido un valor incorrecto");
    }
    else {
      System.out.println("La solución a la ecuación es: " + ecuacion);
    }

    sc.close();
  }
}

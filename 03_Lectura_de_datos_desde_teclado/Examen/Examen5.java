import java.util.Scanner;

public class Examen5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("=========");

    System.out.println("Introduzca el factor TBW de tus disco duro SSD: ");
    Double twb = sc.nextDouble();

    Double solucion = twb / (365*6);
    Double simpli = solucion * 1024;

    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: " + solucion + " TB ("+ simpli + " GB )" );

    sc.close();
  }
}

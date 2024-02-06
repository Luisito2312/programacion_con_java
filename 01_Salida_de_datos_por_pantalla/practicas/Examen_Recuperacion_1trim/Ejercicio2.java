/*
 Conversor de euros a pesetas
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int pesetas;
    double euros;
    
    System.out.println("Introduce la cantidad de euros que va a pasar a pesetas");
    euros = sc.nextDouble();

    double conversion = euros * 166.386;
    pesetas = (int)(conversion);

    System.out.printf("%.2f euros ", euros);
    System.out.println("son: " + pesetas+" pesetas");
    sc.close();
  }
}

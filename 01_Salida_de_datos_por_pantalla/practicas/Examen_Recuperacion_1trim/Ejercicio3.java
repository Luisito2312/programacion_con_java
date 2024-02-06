/*
Conversor de pesetas a euros * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pesetas;
    double euros;
    
    System.out.println("Introduce la cantidad de pesetas que va a pasar a pesetas");
    pesetas = sc.nextInt();

    double conversion = pesetas / 166.386;
    euros = conversion;

    System.out.print( pesetas+" pesetas");
    System.out.printf(" son %.2f euros ", euros);
    sc.close();
  }
}

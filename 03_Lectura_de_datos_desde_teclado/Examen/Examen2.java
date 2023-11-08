
import java.util.Scanner;

public class Examen2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el nombre del producto a comprar");
    String producto = sc.nextLine();

    System.out.println("Introduce el precio del producto a comprar");
    int precio = sc.nextInt();

    System.out.println("Introduce la cantidad del producto a comprar (Sin IVA)");
    int cantidad = sc.nextInt();

    System.out.println("Factura");
    System.out.println("====================");
    System.out.printf("Artículo     " +  producto );
    System.out.println("Precio      " + precio);
  }
}

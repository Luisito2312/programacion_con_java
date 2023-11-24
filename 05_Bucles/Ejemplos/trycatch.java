import java.util.Scanner;

public class trycatch {
  public static void main(String[] args) {
    double numero1;
    double numero2;

    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Introduce el primer numero: ");
      numero1 = sc.nextDouble();
      System.out.println("Introduce el segundo número: ");
      numero2 = sc.nextDouble();

      System.out.println("la media es: "+(numero1+numero2) / 2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media");
      System.out.println("Los datos introducidos no son correctos");
    } finally {
      System.out.println("Gracias por utilizar este programa");
    }
    sc.close();
  }
}

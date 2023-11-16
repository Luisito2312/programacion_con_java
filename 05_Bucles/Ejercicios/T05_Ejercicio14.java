import java.util.Scanner;

public class T05_Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    int num = sc.nextInt();

    System.out.println("Introduce una potencia");
    int pot = sc.nextInt();

    int nu1 = num;
    for (int i = 0; i <= pot; i++) {
      nu1 = nu1 * num;
      System.out.println(nu1);
    }
    System.out.println("El resultado de la potencia en base "+pot+" del número "+num+" es: "+nu1);

    sc.close();
  }
}

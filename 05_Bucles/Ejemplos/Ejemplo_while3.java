import java.util.Scanner;

public class Ejemplo_while3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;
    int suma = 0;
    System.out.println("Introduce un número");
      int num = sc.nextInt();

    while (num > 0) {
      System.out.println("Número introducido "+ num);
      System.out.println("Introduzca otro número");
      num = sc.nextInt();
      i++;
      if (num > 0){
        suma += num;
      }
    }
    System.out.println("Ha introducido un número que no es entero");
    System.out.println("En total ha introducido "+i+ " números positivos");
    System.out.println("La suma de los números positivos introducidos es "+suma);

    sc.close();
  }
}

import java.util.Scanner;

public class T05_Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número para sacar la tabla de multiplicar");
    int num = sc.nextInt();

    for (int i = 0; i < 11; i++) {
      System.out.println(num + " x " + i + " = "+ (num * i) );
    }
    sc.close();
  }
}

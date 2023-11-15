import java.util.Scanner;

public class T05_Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número para sacar la tabla de multiplicar");
    int num = sc.nextInt();

    for (int i = 0; i < 11; i++) {
      System.out.printf("%2d x %2d = %3d\n", num , i , (num*i));
    } 
    sc.close();
  }
}

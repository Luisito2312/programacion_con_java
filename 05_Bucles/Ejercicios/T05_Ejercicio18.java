import java.util.Scanner;

public class T05_Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer número");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo número");
    int num2 = sc.nextInt();

    if (num1 > num2) {
      for (int i = num2; i <= num1; i += 7) {
        System.out.println(i);
      }
    } else if (num2 > num1) {
      for (int i = num1; i <= num2; i += 7) {
        System.out.println(i);
      }
    }
    sc.close();
  }
}

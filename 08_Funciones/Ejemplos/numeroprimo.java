import java.util.Scanner;
public class numeroprimo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int res = 0;
    int j = 0;

    System.out.println("Introduce un número para ver si es primo o no");
    int n = sc.nextInt();


    for (int i = 1; i <= n; i++) {
      res = n % i;
      if (res == 0) {
        j++;
      }
    }

    if (j == 2){
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }
    sc.close();
  }
}

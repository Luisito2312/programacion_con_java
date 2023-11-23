import java.util.Scanner;

public class T05_Ejercicio25 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int NumeroVolteado = 0;

    System.out.println("Introduce un número ");
    int n = sc.nextInt();
    int Copian = Math.abs(n);

    while (Copian > 0) {
      NumeroVolteado = (Copian % 10) + (NumeroVolteado * 10);
      Copian /= 10;
      
    }

    if (n > 0) {
      System.out.println("El número "+n+" volteado es "+NumeroVolteado+". ");
    } else {
      System.out.println("El número "+n+" volteado es "+NumeroVolteado+". ");
    }
    sc.close();
  }
}

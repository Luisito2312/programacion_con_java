import java.util.Scanner;

public class T05_Ejercicio07 {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

      int i = 1;
      int cod = 0;
    do {
      System.out.println("Introduce la contraseña de cuatro cifras");
      cod = sc.nextInt();

      if (cod == 5486) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        i=5;
      } else {
        System.out.println("Lo siento, esa no es la contraseña correcta");
        i++;
      }
      
    } while ((i<=4));  
    sc.close();
  }
}

/*
 Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Luis Godino
 */
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

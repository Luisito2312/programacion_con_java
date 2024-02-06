/*
 Números amigos: solicita dos valores numéricos enteros y mostrará por pantalla true o false después de la pregunta
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean amigos = false;
    int sumaDivisores = 0;
    int sumaDivisores2 = 0;

    System.out.println("Introduce el primer numero a comprobar");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo numero a comprobar");
    int num2 = sc.nextInt();

    for (int i = 1; i < num1; i++) {
      if (num1 % i == 0) {
        sumaDivisores += i;
      }
    }
    
    for (int i = 1; i < num2; i++) {
      if (num2 % i == 0) {
        sumaDivisores2 += i;
      }
    }

    if ((sumaDivisores == num2) && (sumaDivisores2 == num1)) {
      amigos = true;
    } else {
      amigos = false;
    }

    System.out.println("Son los números "+num1+" y "+num2+" amigos?");
    if (amigos == true) {
      System.out.println(amigos);
    } else if (amigos == false) {
      System.out.println(amigos);
    }

    sc.close();
  }
}

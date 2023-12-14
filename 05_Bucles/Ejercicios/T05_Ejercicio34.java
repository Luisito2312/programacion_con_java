/*
 Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio34 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int pares = 0;
    int impares = 0;

    System.out.println("Por favor, introduzca un número");
    int num1 = sc.nextInt();
    int Copianum1 = Math.abs(num1);

    System.out.println("Introduzca otro número");
    int num2 = sc.nextInt();
    int Copianum2 = Math.abs(num2);

  }
}

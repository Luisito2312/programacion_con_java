/*
 Realizar un programa que pida los numeros y luego muestre el resultado de su multiplicacion
 * 
 * @author Luis Godino
 */

public class T03_Ejercicio01 {
  public static void main(String[] args) {
    String linea;

    System.out.print("Introduce un número ");
    linea = System.console().readLine(); //Esta línea es para pedir información por pantalla.
    int num1;
    num1 = Integer.parseInt(linea);

    System.out.print("Introduce otro número ");
    linea = System.console().readLine(); //Esta línea es para pedir información por pantalla.
    int num2;
    num2 = Integer.parseInt(linea);

    System.out.println("La multiplicación de los números introducidos es: " + (num1 * num2));
  }
}

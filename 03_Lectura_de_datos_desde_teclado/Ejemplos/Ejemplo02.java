/*
 En este ejemplo lo que hago es pedir información por pantalla y pasarlos de un tipo de variable a otro
 * 
 * @author Luis Godino
 */
public class Ejemplo02 {
  public static void main(String[] args) {
    
  String linea; //Variable que alamcenará cada línea que introduzcamos por teclado.

    System.out.print("Introduce un número entero: "); //Pedimos el primer número
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea); //Convertimos de string a int

    System.out.print("Introduce otro número entero: "); //Pedimos el segundo número
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea); //Convertimos de string a int

    System.out.printf("El primer número es: %d \n" , num1 );
    System.out.printf("El segundo número es: %d \n" , num2 );

    System.out.println("El doble del número " + num1 + " es " + (num1 * 2));
    System.out.println("Y la mitad del número " + num2 + " es " + (num2 / 2));

    //Parseamos float
    System.out.println("Introduce un número real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("El número real introducido es: %.2f" , numReal);
  }
}

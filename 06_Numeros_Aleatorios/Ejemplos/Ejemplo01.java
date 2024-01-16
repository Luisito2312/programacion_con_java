/*
 Genera 10 números del 0 al 1 sin incluir el 1
 * 
 * @author Luis Godino
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = Math.random();
      System.out.println(numero);
    }

    
  }
}

/*
 Genera 10 números entre 0 y 9 sin incluir el 10
 * 
 * @author Luis Godino
 */
public class Ejemplo02 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = (Math.random()*10);
      System.out.println(numero);
    }

  }
}

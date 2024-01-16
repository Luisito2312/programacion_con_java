/*
 Genera números entre 0 y 10 sin incluir el 10
 * 
 * @author Luis Godino
 */
public class Ejemplo03 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10);
      System.out.println(numero);
    }
  }
}

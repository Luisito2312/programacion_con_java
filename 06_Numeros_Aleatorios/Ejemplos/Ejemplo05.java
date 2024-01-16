/*
 Genera 10 números entre el 50 y el 71 sin incluir el 71
 * 
 * @author Luis Godino
 */
public class Ejemplo05 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*21 +50); // [50,70] / [50,71)
      System.out.println(numero);
    }
  }
}

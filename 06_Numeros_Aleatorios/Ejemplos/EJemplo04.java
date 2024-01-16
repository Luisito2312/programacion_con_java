/*
 Genera números entre el 1 y el 11 sin incluir el 11
 * 
 * @author Luis Godino
 */
public class EJemplo04 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10)+1; // [1,10] / [1,11)
      System.out.println(numero);
    }
  }
}

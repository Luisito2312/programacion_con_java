/*
 Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 * 
 * @author Luis Godino
 */
public class T05_Ejercicio03 {
  public static void main(String[] args) {

    int num = 5;
    
    do {
      System.out.println(num);
      num+=5;

    } while (num < 101);
  }
}

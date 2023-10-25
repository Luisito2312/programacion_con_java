/*
 En este código voy a dibujar algo con caracteres ASCII y añadiéndole algo de color.
 * 
 * @author Luis Godino
 */

public class T01Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("\033[1;32mHELLO \033[0m  \033[1;35m{\\__/}   ");
    System.out.println("\033[0m");  //reseteo de color
    System.out.print("\033[1;34m THERE \033[0m \033[1;35m( *.*)");
    System.out.println("\033[0m");  //reseteo de color
    System.out.print("        \033[1;35m/ > \u2665 \033[0m");

  }
}

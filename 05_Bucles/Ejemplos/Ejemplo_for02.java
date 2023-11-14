/*
 Mostrar las tablas de multiplicar del 2 del 4 y del 6
 * 
 * @author Luis Godino
 */
public class Ejemplo_for02 {
  public static void main(String[] args) {
    
    for (int i = 2; i <= 6; i += 2 ){
      for (int j = 0; j <= 10; j++){
        System.out.println(i + " x " + j +" = " + i*j);
      }
    }
  }
}

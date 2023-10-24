/*
 Salida formateada utilizando enteros decimales y decimales 
 * 
 * @author Luis Godino
 */
public class SalidaFormateada01 {
  public static void main(String[] args) {
      System.out.printf("El número %d no tiene decimales.\n", 21);
      System.out.printf("El número %f tiene decimales.\n", 21.2);
      System.out.printf("El %.3f sale exacactamente con %d decimales.\n", 50.32, 3);
      System.out.printf("La letra: %c.\n", 83);

     // Para ver el orden
      System.out.printf("Mostramos el segundo argumento: %2$d \nY después el primero: %1$.2f", 23.34, 56);
  }
}
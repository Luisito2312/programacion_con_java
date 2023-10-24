/*
 Salilda formateada utilizando distintos flags
 * 
 * @author Luis Godino
 */
public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100);
    System.out.printf("%08d\n", 100);
    System.out.printf("%+8d\n", 100);
    System.out.printf("%-8d\n", 100);
  }
  
}
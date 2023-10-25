/*
 En este código se hace una factura con una base definida y el IVA.
 * 
 * @author Luis Godino
 */
public class T02Ejercicio6 {
  public static void main(String[] args) {
   
    double baseImponible = 43.56;
   
    System.out.printf("\033[0;32mBase imponible \033[0m \033[1;31m %8.2f\n", baseImponible) ;
    System.out.println("\033[0m");  //reseteo de color
    System.out.printf("\033[0;32mIVA \033[0m \033[1;31m            %8.2f\n", baseImponible * 00.21) ;
    System.out.println("\033[0m");  //reseteo de color
    System.out.println("------------------------------------");
    System.out.println("Total:              " +(baseImponible + 9.15));
  }
}

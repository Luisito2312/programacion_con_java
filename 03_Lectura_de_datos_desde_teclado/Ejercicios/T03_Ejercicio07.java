/*
 Explica tu código aquí
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio07 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el importe SIN IVA de su compra ");
    Double baseImponible = sc.nextDouble();

    Double iva = baseImponible * 0.21;

    System.out.printf("\033[0;32mBase imponible \033[0m \033[1;31m %8.2f\n", baseImponible) ;
    System.out.println("\033[0m");  //reseteo de color
    System.out.printf("\033[0;32mIVA \033[0m \033[1;31m            %8.2f\n", iva) ;
    System.out.println("\033[0m");  //reseteo de color
    System.out.println("------------------------------------");
    System.out.println("Total:              " +(baseImponible + iva));

    sc.close();
  }
}

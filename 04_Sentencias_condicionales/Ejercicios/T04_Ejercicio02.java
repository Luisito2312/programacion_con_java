/*
 Tengo que hacer un código que al introducir una hora del día me saque por pantalla un mensaje distinto dependiendo de la hora
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una hora del día, sin los minutos");
    int hora = sc.nextInt();

    if (( hora >= 6 ) && ( hora <= 12 )) {
      System.out.println("Buenos días!!");
  }
    else if ((hora >= 13) && (hora <= 20)){
      System.out.println("Buenas tardes!");
  }
    else if ((hora >= 21) && (hora <= 5)) {
      System.out.println("Buenas noches!!!");
    }
  
  sc.close();
}
}

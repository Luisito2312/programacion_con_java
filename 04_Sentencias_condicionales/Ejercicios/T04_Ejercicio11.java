/*
 Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T04_Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Inroduce la hora y los minutos separados por un espacio");
    int hora = sc.nextInt();
    int minuto = sc.nextInt();

    int medianocheh = (hora * 3600) + (minuto * 60);
    int medianochem = (24 * 3600) - (medianocheh);

    System.out.printf("Desde las %02d:%02d hasta medianoche faltan %d segundos. \n" , hora, minuto, medianochem);

    sc.close();
  }
}

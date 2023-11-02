/*
 En este código se hace un conversor de euros a pesetas en el que se introduce la cantidad que se va a cambiar
 * 
 * @author Luis Godino
 */

import java.util.Scanner;

public class T03_Ejercicio03 {
  public static void main(String[] args) {
    
              
    double cambio = 0.006; 

    Scanner sc = new Scanner(System.in);
    int pesetas;

    System.out.println("Introduca el importe en pesetas");
    pesetas = sc.nextInt();

          
    double euross = pesetas * cambio;

          System.out.println(pesetas + " el total de euros es " + euross + " euros.");

          sc.close();
        }
  }


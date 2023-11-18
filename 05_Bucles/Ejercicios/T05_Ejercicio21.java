/*
 Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio21 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int contadorNumeros = 0;
    int sumaImpares = 0;
    int cantidadImpares = 0;
    int mayorPar = Integer.MIN_VALUE;

        System.out.println("Introduce números (ingresa un número negativo para finalizar):");

        int numero = sc.nextInt();

        while (numero >= 0) {
            contadorNumeros++;

            if (numero % 2 != 0) {
                // Es impar
                sumaImpares += numero;
                cantidadImpares++;
            } else {
                // Es par
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }

            numero = sc.nextInt();
        }

        if (contadorNumeros > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;

            System.out.println("Cantidad de números introducidos: " + contadorNumeros);
            System.out.println("Media de los impares: " + mediaImpares);

            if (mayorPar != Integer.MIN_VALUE) {
                System.out.println("Mayor de los pares: " + mayorPar);
            } else {
                System.out.println("No se han introducido números pares.");
            }
        } else {
            System.out.println("No se han introducido números.");
        }

        sc.close();
    }
}
/*
 Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
 * 
 * @author Luis Godino
 */
import java.util.Scanner;

public class T05_Ejercicio24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de filas
        System.out.print("Introduce el número de filas para la pirámide: ");
        int n = scanner.nextInt();

        // Imprimir la pirámide de números
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Imprimir números ascendentes
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Imprimir números descendentes
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            // Ir a la siguiente línea para la siguiente fila
            System.out.println();
        }

        scanner.close();
    }
  }


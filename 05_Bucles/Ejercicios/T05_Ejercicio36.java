import java.util.Scanner;

public class T05_Ejercicio36 {
  public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        long numero = scanner.nextLong();

        scanner.close();

        // Verificar si el número es capicúo
        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúo.");
        } else {
            System.out.println("El número " + numero + " no es capicúo.");
        }
    }

    // Método para verificar si un número es capicúa
    static boolean esCapicua(long numero) {
        // Convertir el número a una cadena para facilitar la comparación
        String numeroStr = Long.toString(numero);

        // Comparar la cadena original con su reverso
        String reverso = new StringBuilder(numeroStr).reverse().toString();

        return numeroStr.equals(reverso);
    }
}


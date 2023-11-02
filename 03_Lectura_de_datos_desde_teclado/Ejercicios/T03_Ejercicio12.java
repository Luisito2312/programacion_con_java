import java.util.Scanner;

public class T03_Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la nota del primer examen: ");
        double notaPrimerExamen = sc.nextDouble();

        System.out.print("Ingresa la media deseada: ");
        double mediaDeseada = sc.nextDouble();

        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        System.out.println("Necesitas obtener al menos " + notaSegundoExamen + " en el segundo examen para alcanzar la media deseada.");

        sc.close();
  }
}

import java.util.Scanner;

public class h {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            // Solicitar nombre del alumno
            System.out.print("Introduce el nombre del alumno (Apellido1 Apellido2, Nombre): ");
            String nombreAlumno = scanner.nextLine();

            // Solicitar notas del primer, segundo y tercer trimestre
            int notaPrimerTrimestre = solicitarNota("primer");
            int notaSegundoTrimestre = solicitarNota("segundo");
            int notaTercerTrimestre = solicitarNota("tercer");

            // Calcular la nota media final
            double notaMediaFinal = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3.0;

            // Mostrar la información en forma de tabla
            mostrarTabla(nombreAlumno, notaPrimerTrimestre, notaSegundoTrimestre, notaTercerTrimestre, notaMediaFinal);

            // Preguntar si desea continuar
            System.out.print("¿Desea continuar introduciendo notas de nuevos alumnos? (S/N): ");
            continuar = scanner.nextLine().charAt(0);
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    // Método para solicitar una nota entre 0 y 10
    private static int solicitarNota(String trimestre) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        scanner.close();
        do {
            System.out.print("Introduce la nota del " + trimestre + " trimestre (entre 0 y 10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next();
            }
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }
        } while (nota < 0 || nota > 10);

        scanner.nextLine(); // Consumir el salto de línea pendiente
        return nota;
    }

    // Método para mostrar la tabla de resultados con formato
    private static void mostrarTabla(String nombre, int notaPrimerTrimestre, int notaSegundoTrimestre, int notaTercerTrimestre, double notaMediaFinal) {
        String colorNota = (notaMediaFinal < 5) ? "\033[31m" : "\033[32m";
        String resetColor = "\033[0m";

        System.out.printf("%-" + nombre.length() + "s | \033[1m%s\033[0m | \033[1m%s\033[0m | \033[1m%s\033[0m | Nota media final: %s%.2f%s\n",
                nombre, colorNota + notaPrimerTrimestre + resetColor, colorNota + notaSegundoTrimestre + resetColor,
                colorNota + notaTercerTrimestre + resetColor, colorNota, notaMediaFinal, resetColor);
    }
}

package CRUD;

import java.util.ArrayList;

public class MainAlumno {
  public static void main(String[] args) {

    Alumno[] alumnos = new Alumno[100];
    boolean seguir = true;
    String nombreIntroducido;
    int edad;

    
    do {
      System.out.println("Que operacion quieres hacer?");
      System.out.println("1- Insertar alumno");
      System.out.println("2- Eliminar un alumno");
      System.out.println("3- Editar un alumno");
      System.out.println("4- Mostrar alumnos");
      int opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
        int primeraLibre = -1;
        do {
          primeraLibre++;
          System.out.println(primeraLibre);
        } while (alumnos[primeraLibre] != null);
        System.out.println("Por favor, introduzca los datos del alumno.");  
        System.out.print("Nombre: ");
        nombreIntroducido = System.console().readLine();
        System.out.println("Introduce la edad");
        edad = Integer.parseInt(System.console().readLine());
        alumnos[primeraLibre] = new Alumno(nombreIntroducido, edad);
          break;
      
        case 2:
          System.out.println("Introduce el nombre del alumno que quieres eliminar: ");
          nombreIntroducido = System.console().readLine();
  
          for ( a : alumnos) {
            if (nombre.equals(a.getNombre().equals(nombre))) {
              alumnos.remove(a);
            }
          }
        break;
        case 4:
          for (Alumno alumno : alumnos) {
            System.out.println("Nombre: "+alumno.getNombre()+", Edad: "+alumno.getEdad());
          }
  
        break;  
        default:
          break;
      }
    } while (seguir);
    
  }
}

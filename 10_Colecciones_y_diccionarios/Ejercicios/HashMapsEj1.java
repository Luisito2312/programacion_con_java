/*
 Programa que gestiona usuarios de una plataforma.
 * 
 * @author Luis Godino
 */

import java.util.HashMap;

public class HashMapsEj1 {
  public static void main(String[] args) {
    
    HashMap<String, String> bbdd = new HashMap<>();
    String usuario;
    String passwd;
    boolean acceso = false;
    int intentos = 3;

    bbdd.put("admin", "12345");
    bbdd.put("Comunista24", "Potato2312");
    bbdd.put("usuario1", "usuario");
    bbdd.put("Luisito", "holaAt0dO5");
    
    do {
      System.out.println("Por favor introduce el nombre de usuario: ");
      usuario = System.console().readLine();

      System.out.println("Por favor introduce la contraseña: ");
      passwd = System.console().readLine();

      if (bbdd.containsKey(usuario)) {  //El usuario existe
        if (bbdd.get(usuario).equals(passwd)) {  // La contraseña coincide
          System.out.println("Bienvenido a su area personal");
          acceso = true;
        } else {
          System.out.println("Contraseña incorrecta");
          intentos--;
        }
      } else {
        System.out.println("El usuario introducido no está registrado");
        intentos--;
      }

      if (!acceso && intentos > 0) {
        System.out.println("Le quedan "+intentos+" intentos");
      }
    } while (!acceso && intentos > 0);

    if (!acceso) {
      System.out.println("Lo sentimos, no tiene acceso a la zona privada");
    }
  }
}

package Herencias;
/* 
Clase qu tendra el metodo main para probar la herencia * 
 * @author Luis Godino
 */
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Personas p = new Personas("Pepe Rodriguez", 30, "79384774K");
    Estudiante e = new Estudiante("Paula Gomez", 21, "16837548L");
    Profesor profe = new Profesor("Jose", 12, "12345678L", "Informática", 20000);
    
    p.mostrarDatos();
    e.mostrarDatos();
    p.toString();

    profe.mostrarDatos();
    profe.toString();



   
  }
}

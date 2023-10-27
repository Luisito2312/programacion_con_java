/*
 En este código tengo que crear cinco variables de tipo car, y un string y almacenar en ese string la concatenación
 de las otras cinco variables y mostrarlas por pantalla a la vez.
 * 
 * @author Luis Godino
 */
public class T02Ejercicio8 {
  public static void main(String[] args) {
    
    char primera = 'L';
    char segunda = 'U';
    char tercera = 'I';
    char cuarta = 'S';
    char quinta = 'G';

    String entero =(primera + "" + segunda + "" + tercera + "" + cuarta + "" + quinta);

    System.out.println( "Mi nombre y primera letra de mi apellido soncd de  : " + entero );
  }
}
